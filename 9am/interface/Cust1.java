import java.util.*;
class Cust1
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
System.out.println("enter t value");
int t=sc.nextInt();
Class c=Class.forName(args[0]);
FinAdv c1=(FinAdv)c.newInstance();
c1.fd();
c1.nd();
}
}