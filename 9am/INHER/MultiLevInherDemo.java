class Abc
{
int x=90;
void m1()
{
System.out.println("super class method");
}
}
class Pqr extends Abc 
{
int y=55;
void m2()
{
System.out.println("sub class method");
System.out.println("y="+y);
System.out.println("x="+x);
}
}
class Xyz extends Pqr
{
void m3()
{
System.out.println("sub sub class method");
System.out.println("y="+y);
System.out.println("x="+x);
}
}
class MultiLevInherDemo
{
public static void main(String args[])
{
Xyz x=new Xyz();
x.m3();
x.m2();
x.m1();
}	
}