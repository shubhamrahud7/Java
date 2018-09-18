class MethodsDemo
{
int x=90;
static int y=55;
void m1()
{
System.out.println("x="+x);
System.out.println("y="+y);
}
static void m2()
{
MethodsDemo md=new MethodsDemo();	
System.out.println("x="+md.x);
System.out.println("y="+y);
}
void m3()
{
	m1();
	m2();
}
public static void main(String args[])
{
	MethodsDemo md1=new MethodsDemo();
	md1.m3();
	m2();
}
}