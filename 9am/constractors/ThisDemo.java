class Bike
{
	int cc;
	String model;
	double price;
Bike(int cc,String mo,double price)
{
	this.cc=cc;
	model=mo;
	this.price=price;
}
void display()
{
System.out.println("cc="+cc);
System.out.println("model="+model);
System.out.println("price="+price);	
}
}
class ThisDemo
{
public static void main(String args[])
{
Bike b1=new Bike(150,"fz2020",85000);
b1.display();
}
}