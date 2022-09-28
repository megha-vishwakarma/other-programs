import javax.swing.*;
public class MyTable{
JFrame f;
MyTable(){
f = new JFrame();
String data[][] = {{"101", "Zayn", "67000"}, 
{"102", "Harry", "78000"}, 
{"103", "Nail", "70000"},
{"104", "Azmi", "79000"},
{"105", "Jerry", "80000"}};
String column[] = {"Eno", "Ename", "Salary"};
JTable jt = new JTable(data, column);
jt.setBounds(30,40,200,300);
JScrollPane sp = new JScrollPane(jt);
f.add(sp);
f.setSize(300, 400);
f.setVisible(true);
}
public static void main(String[] args){
new MyTable();
}
}


