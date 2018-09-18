class Test
{
void m1()
{
System.out.println("this is over class method");
Demo d=new Demo();
d.m2();
	class Demo  // local inner class
	{
	void m2()
	{
	System.out.println("inner class method");
	}
	}
}
void m3()
{//Demo d=new Demo();
//d.m2();
	System.out.println("this is over class method");}
}