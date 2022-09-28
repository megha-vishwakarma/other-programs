/* An Applet skeleton.
import java.awt.*;
import java.applet.Applet;
/*
<applet code="AppletSkel" width=300 height=100>
</applet>
*/
public class AppletSkel extends Applet {
// Called first.
		public void init() {
// initialization
}
/* Called second, after init(). Also called whenever
the applet is restarted. */
		public void start() {
// start or resume execution
}
// Called when the applet is stopped.
public void stop() {
// suspends execution
}
/* Called when applet is terminated. This is the last
method executed. */
public void destroy() {
// perform shutdown activities
}
// Called when an applet's window must be restored.
public void paint(Graphics g) {
// redisplay contents of window
}
}

*/






import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="ButtonDemo" width=250 height=150>
</applet>
*/

public class ButtonDemo extends Applet implements ActionListener 
{
	String msg = "";
	Button yes, no, maybe;

	public void init() 
	{
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("Undecided");
		add(yes);
		add(no);
		add(maybe);
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) 
	{     String str = ae.getActionCommand();
		if(str.equals("Yes")) 
		{ 
			msg = "You pressed Yes.";
		}
		else if(str.equals("No")) 
		{ 
			msg = "You pressed No.";
		}
		else 
		{
			msg = "You pressed Undecided.";
		}
		repaint();
	}

	public void paint(Graphics g) 
	{
		g.drawString(msg, 6, 100);
	}
}
