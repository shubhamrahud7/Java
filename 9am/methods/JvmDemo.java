class JvmDemo
{
static 
{
System.out.println("welcome");
}	
void m1()
{
System.out.println("this is instnace method");
}	
public static void main(String args[])
{
System.out.println("static method");
JvmDemo j=new JvmDemo();
j.m1();
}	
static 
{
System.out.println("ok");
}
}