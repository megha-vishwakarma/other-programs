import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class BookSales_JTable extends JFrame implements ItemListener
{
JComboBox cb;
String head[]={"SalesID","Date","Amount"};
String as[ ][ ]=new String[10][10];
public BookSales_JTable()
{
setLayout(null);
cb=new JComboBox();
cb.setBounds(350,20,100,20);
cb.addItem("JAN");
cb.addItem("FEB");
cb.addItem("MARCH");
cb.addItem("APRIL");
cb.addItem("MAY");
cb.addItem("JUN");
cb.addItem("JULY");
cb.addItem("AUG");
cb.addItem("SEP");
cb.addItem("OCT");
cb.addItem("NOV");
cb.addItem("DEC");
add(cb);
cb.addItemListener(this);
setSize(500,400);
setVisible(true);
}
public void itemStateChanged(ItemEvent ie)
{
int m=cb.getSelectedIndex();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cn=DriverManager.getConnection("jdbc:odbc:db1");
Statement st=cn.createStatement();
ResultSet rs=st.executeQuery("select * from BookSale where Month(PubDate)="+(m+1));
int i=0;
while(rs.next())
{
as[i][0]=rs.getString("1");
as[i][1]=rs.getString("2");
as[i][2]=rs.getString("3");
i++;
}
cn.close();
JTable jt=new JTable(as,head);
JScrollPane pane=new JScrollPane(jt);
pane.setBounds(0,0,300,400);
getContentPane().add(pane);
}catch(Exception e)
{

System.out.println(e);
}
}
public static void main(String args[])
{
new BookSales_JTable();
}
}