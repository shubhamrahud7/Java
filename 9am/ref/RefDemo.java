class RefDemo
{
public static void main(String args[])throws Exception
{
String s1=args[0];
Class c=Class.forName(s1);
System.out.println(c.getConstructors());
}
}