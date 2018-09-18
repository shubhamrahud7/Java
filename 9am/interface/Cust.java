import java.util.*;
class Cust
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter t value");
int t=sc.nextInt();
FinAdv c1=new Hdfc(t);
c1.fd();
c1.nd();
FinAdv c2=new Icici(t);
c2.fd();
c2.nd();
FinAdv c3=new IDbi(t);
c3.fd();
c3.nd();
}
}