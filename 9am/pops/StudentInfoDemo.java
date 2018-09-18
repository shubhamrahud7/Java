import java.util.*;
class StudentInfoDemo 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter student age");
byte age=sc.nextByte();
System.out.println("enter student rollno");
short rno=sc.nextShort();
System.out.println("enter student fee");
int fee=sc.nextInt();
System.out.println("enter student adno");
long adno=sc.nextLong();
System.out.println("enter student hig");
float hig=sc.nextFloat();
System.out.println("enter student weg");
double weg=sc.nextDouble();
System.out.println("enter student Gender");
char gen=sc.next().charAt(0);
System.out.println("enter student result");
boolean res=sc.nextBoolean();
System.out.println("enter student name");
String sname=sc.next();
System.out.println("student name="+sname);
System.out.println("student age="+age);
System.out.println("student Gender="+gen);
System.out.println("student hig="+hig);
System.out.println("student weg="+weg);
System.out.println("student result="+res);
System.out.println("student adno="+adno);
System.out.println("student rollNumber="+rno);
System.out.println("student fee="+fee);
	}
}