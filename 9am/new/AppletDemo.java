import java.awt.*;
import java.applet.*;
public class AppletDemo extends Applet
{
public void init()
{setBackground(Color.red);
}
public void start()
{System.out.println("applet is started");
}
public void stop()
{System.out.println("applet is stoped");
}
public void destory()
{System.out.println("applet is closed");
}
public void paint(Graphics g)
{
//g.drawString("NARESH",200,150);
g.drawOval(200, 120, 150, 130);
}} 