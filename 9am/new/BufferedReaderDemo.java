import java.io.*;
class BufferedReaderDemo
{
public static void main(String args[])
{
try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));)
{	
System.out.println("enter stu age");
byte age=Byte.parseByte(br.readLine());
System.out.println("stu age="+age);
}
catch(Exception e)
{
e.printStackTrace();	
}
}
}