import java.awt.*;
import javax.swing.*;

public class swingDemo1
{
public static void main(String args[]) {
JFrame frame=new JFrame("MY First GUI");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,300);
JButton button1=new JButton("Press");
frame.getContentPane().add(button1);
frame.setVisible(true);
}
}