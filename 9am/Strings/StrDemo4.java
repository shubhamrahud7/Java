import java.util.*;
import java.io.*;
class StrDemo4
{
public static void main(String args[])
{
Console c=System.console();
Scanner sc=new Scanner(System.in);
System.out.println("enter pattarn");	
String s1=c.readLine();
System.out.println("enter no of student name");
int n=sc.nextInt();
System.out.println("enter student name");
int i=1;	
int x=0;
int y=0;
int z=0;
while(i<=n)
{	
String sname=c.readLine();
boolean b=sname.contains(s1);
if(b==true)
{
	x++;
}
boolean d=sname.endsWith(s1);
if(d==true)
{z++;
}
boolean e=sname.startsWith(s1);
if(e==true)
{
y++;
}
i++;
}
System.out.println("no of students contains="+x);
System.out.println("no of students startsWith="+y);
System.out.println("no of students endsWith="+z);
}
}



