import java.util.*;
class ExceptionDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 no");
int a=sc.nextInt();
int b=sc.nextInt();
try
{
		int marks[]=new int[5];
		try{
		marks[19]=55;
		System.out.println(marks[19]);
		}
		catch(Exception e)
		{
			e. printStackTrace();	
		}
		String s1=null;
		try{
		s1.replace("na","su");
			}
		catch(Exception e)
		{
		e. printStackTrace();	
		}
int c=a/b;
System.out.println("div value="+c);
}
catch(Exception e)
{
e. printStackTrace();	
}

System.out.println("ok");
System.out.println("this part exe if there is no exception");
System.out.println("if exception is arrives ");
System.out.println("program terminated from that line only");
}
}