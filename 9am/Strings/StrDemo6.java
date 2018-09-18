import java.io.*;
class StrDemo6
{
public static void main(String args[])
{
Console c=System.console();
System.out.println("enter ant String");	
String s1=c.readLine();
System.out.println(s1);
StringBuffer sb=new StringBuffer(s1);
sb.reverse();
System.out.println(sb);
String s2=sb.toString();
boolean b=s1.equals(s2);
if(b==true)
{
System.out.println("poly ");
}
else
{
System.out.println("not poly ");
}
}
}