import java.io.*;
class FileCopyDemo
{
public static void main(String args[])throws Exception
{
FileInputStream fis=new FileInputStream("D:/New folder/balu.txt");
FileOutputStream fos=new  FileOutputStream("vekat.txt");
int ch;
while((ch=fis.read())!=-1)
{
fos.write((char)ch);
}
}
}
	