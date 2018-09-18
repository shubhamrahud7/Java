import java.util.*;
class SwitchWithStringDemo
{
public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter Coursename");
String cname=sc.next();
switch(cname)
{
case "java":
case "Java":
case "JAVA":
{
System.out.println ("j2se,j2ee,j2ME");
break;
}
case "Sql":
case "SQL":
case "sql":
{
System.out.println ("sql& plsql");
break;
}
}
}
}