class EqualtyDemo
{
public static void main(String args[])
{
String s1="admin";
//String s2="admin";
String s2=new String("admin");
System.out.println("s1="+s1);
System.out.println("s2="+s2);
boolean b=s1.equals(s2);
if(b==true)
{
System.out.println("both are same");
}
else
{
System.out.println("both are not same");	
}	
}
}