class Demo
{
static int x=90;  // instance or non static var
Demo()
{
x++;
System.out.println("x="+x);
}
}
class InstanceVarDemo
{
public static void main(String args[])
{
Demo d1=new Demo();
Demo d2=new Demo();
Demo d3=new Demo();
Demo d4=new Demo();
Demo d5=new Demo();
}
}
