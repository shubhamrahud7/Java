class SupClassInfo
{
public static void info(String s1)throws Exception
{
Class c=Class.forName(s1);	
System.out.println(c.getSuperclass());
}
public static void main(String args[])throws Exception
{
info(args[0]);
}
}	
