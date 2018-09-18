class App1
{
public static void SuperclassInfo(String name)throws Exception
  {  
 Class c=Class.forName(name);
 System.out.println(c.getSuperclass());
 }
public static void main(String args[])throws Exception
{
SuperclassInfo(args[0]);
}
}
