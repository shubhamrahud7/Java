import java.io.*;
class IfDemo 
{
public static void main(String[] args) 
{
int pinno=1234;// ret fron database
Console c=System.console();
System.out.println("enter u r pinno");
char pass[]=c.readPassword();
String s1=new String(pass);
int pinno1=Integer.parseInt(s1);
if(pinno==pinno1)
	{
	System.out.println("pinno is ok");
	}
}
} 
