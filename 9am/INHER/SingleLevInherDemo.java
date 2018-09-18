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
class SingleLevInherDemo
{
public static void main(String args[])
{
Abc a=new Abc();
a.m1();
//a.m2();
Pqr p=new Pqr();
p.m1();
p.m2();	
}	
}
