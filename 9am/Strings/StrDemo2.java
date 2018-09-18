import java.io.*;
class StrDemo2
{
public static void main(String args[])
{
String uname="naresh";	
Console c=System.console();
System.out.println("enter username");	
String s1=c.readLine();
int n=s1.compareTo(uname);
int m=s1.compareToIgnoreCase(uname);
System.out.println("compareTo="+n);
System.out.println("compareToIgnoreCase="+m);
if(n==0)
{
	System.out.println("datamatched");
}
}
}