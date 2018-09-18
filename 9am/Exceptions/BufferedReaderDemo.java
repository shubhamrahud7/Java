import java.io.*;
class BufferedReaderDemo
{
public static void main(String args[])
{
try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
{
System.out.println("enter empname=");
String ename=br.readLine();
System.out.println("entered empname="+ename);
}
catch(Exception e)
{e. printStackTrace();}
}
}