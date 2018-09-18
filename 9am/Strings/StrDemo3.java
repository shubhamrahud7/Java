import java.io.*;
class StrDemo3
{
public static void main(String args[])
{
Console c=System.console();
System.out.println("enter Firstname");	
String s1=c.readLine();
System.out.println("enter mid name");	
String s2=c.readLine();
System.out.println("enter Lastname");	
String s3=c.readLine();
String fullname=s1.concat(s3);
System.out.println("fullname="+fullname);
System.out.println("com name="+s1+s2+s3);
}
}

