class Repl1Demo
{
public static void main(String args[])
{	
String s1="naresh";
StringBuffer sb=new StringBuffer(s1);
System.out.println(sb);
//System.out.println(sb.replace(0,2,"su"));
//System.out.println(sb);
sb.append(45);
System.out.println(sb);
sb.insert(2,45.2366);
System.out.println(sb);
sb.delete(2,5);
System.out.println(sb);
}
}