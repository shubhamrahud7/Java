abstract class Bike
{
int mil;
String model;
int cc;
double price;
final int advdfee=5000;
Bike(int mil,String model,int cc,double price)
{
this.mil=mil;
this.model=model;
this.cc=cc;
this.price=price;
}
void custReqInfo()
{
System.out.println("mil="+mil);
System.out.println("model="+model);
System.out.println("cc="+cc);
System.out.println("price="+price);
}
abstract void gare();
abstract void beraking();
}