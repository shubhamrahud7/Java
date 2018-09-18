class Test123
{
void m1()
{
System.out.println("sup class method1");
}
void m2()
{
System.out.println("sup class method2");
}
}
class Demo1 extends Test123
{
void m1()
{
System.out.println("sub class method1");
}
void m2()
{
System.out.println("sub class method2");
}
void use()
{
super.m1();
this.m1();
super.m2();
this.m1();
}
}
class IiqDemo
{
public static void main(String args[])
{
Demo1 d=new Demo1();
d.use();
}
}	
		