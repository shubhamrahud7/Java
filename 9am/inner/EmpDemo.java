import java.util.*;
class EmpDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter empid:");
int eid=sc.nextInt();
System.out.println("enter empname:");
String name=sc.next();
Tcs t=new Tcs(eid,name);
t.empInfo();
Tcs.Att t1=new Tcs.Att();
t1.attUpdate();
}
}