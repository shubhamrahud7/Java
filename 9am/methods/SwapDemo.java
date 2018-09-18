class SwapDemo
{
void interchange(int x,int y)
{
System.out.println("before swaping output");
System.out.println("x="+x);
System.out.println("y="+y);
int z=y;
y=x;
x=z;
System.out.println("after swaping output");
System.out.println("x="+x);
System.out.println("y="+y);
}
void swap(int x,int y)
{
System.out.println("before swaping output");
System.out.println("x="+x);
System.out.println("y="+y);
x=x+y;   //70
y=x-y;   //50
x=x-y;   //20
System.out.println("after swaping output");
System.out.println("x="+x);
System.out.println("y="+y);
}
public static void main(String args[])
{
SwapDemo s=new SwapDemo();
s.interchange(50,20);
s.swap(50,20);
}
}