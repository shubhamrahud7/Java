class C1
{
void m1()
{
System.out.println("c1 logic");
}
}
class C2
{
void m1()
{
System.out.println("c2 logic");
}
}
class C3
{
void m1()
{
System.out.println("c3 logic");
}
}
class ManyAccDemo
{
public static void main(String args[])
{
C1 obj1=new C1();
C2 obj2=new C2();
C3 obj3=new C3();
obj1.m1();
obj2.m1();
obj3.m1();
}
}