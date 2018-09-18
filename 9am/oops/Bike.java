import java.util.*;
class Bike
{
int mil;
String model;
int cc;
String col;
double price;
final int ADVBFEE=5000;
Scanner sc=new Scanner(System.in );
void input()
{
System.out.println("enter mil u wanted");
mil=sc.nextInt();	
System.out.println("enter model u wanted");
model=sc.next();
System.out.println("enter cc u wanted");
cc=sc.nextInt();
System.out.println("enter color u wanted");
col=sc.next();
System.out.println("enter price u wanted");
price=sc.nextDouble();
}
void custReqInfo()
{
System.out.println("mil="+mil);
System.out.println("model="+model);
System.out.println("col="+col);
System.out.println("cc="+cc);
System.out.println("price="+price);
System.out.println("ADVBFEE="+ADVBFEE);
}
}