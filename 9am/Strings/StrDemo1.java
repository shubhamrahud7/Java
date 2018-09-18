import java.io.*;
import java.util.*;
class StrDemo1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Console c=System.console();
System.out.println("enter any string");
String s1=c.readLine();
System.out.println("enter index value");
int n=sc.nextInt();
System.out.println(n+"index char="+s1.charAt(n));
System.out.println(n+"index ascii no="+s1.codePointAt(n));
}
}
