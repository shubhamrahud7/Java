import java.io.*;
class PrintStreamDemo
{
public static void main(String args[])throws Exception
{
FileOutputStream fos=new FileOutputStream("asdf.txt");	
PrintStream ps=new PrintStream(fos);
System.setOut(ps);
System.out.println("ok");
System.out.println("duihvudf");
}
}
		