import java.util.*;
class Demo1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 no");
int a=sc.nextInt();
int b=sc.nextInt();
try
{
	try
	{
	int marks[]=new int[20];
	marks[24]=90;
	System.out.println(marks[24]);
	}
	catch(Exception e)
	{	e.printStackTrace();	}
int c=a/b;
System.out.println("div="+c);
}
catch(Exception e)
{	e.printStackTrace();
}
System.out.println("hai");
System.out.println("ok");
}
}