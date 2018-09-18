import java.io.*;
import java.util.*;
class StringTokenizerDemo
{
public static void main(String args[])
{
Console c=System.console();
System.out.println("enter ant String");	
String s1=c.readLine();
StringTokenizer st=new StringTokenizer(s1);
System.out.println("countTokens="+st.countTokens());
while(st.hasMoreTokens())
{
System.out.println(st.nextToken(","));
}
}
}