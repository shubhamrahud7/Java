abstract class Bike
{
abstract void breaking();
}
interface Nit
{
void info();	
}
class InnerDemo
{
public static void main(String args[])
{
	Bike b1=new Bike()
	                     // class 1
	{
	void breaking()
	{
		System.out.println("ok");
	}
	};
	b1.breaking();
	Nit n=new Nit()
	           // class 2
	{
	public void info()
	{
	System.out.println("hi");	
	}
	};	
}
}
		