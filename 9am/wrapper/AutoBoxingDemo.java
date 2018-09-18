class AutoBoxingDemo
{
public static void main(String args[])
{
int x=90;
Integer obj=new Integer(x); // auto boxing
System.out.println("obj="+obj);
int y=obj;// unboxing
}
}