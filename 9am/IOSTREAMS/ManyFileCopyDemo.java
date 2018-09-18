import java.io.*;
class ManyFileCopyDemo
{
public static void main(String args[])throws Exception
{
FileInputStream fis=new FileInputStream("D:/New folder/balu.txt");
FileOutputStream fos1=new  FileOutputStream("C:/Users/nit/Desktop/vekat.doc");
FileOutputStream fos2=new  FileOutputStream("D:/rajufiles/raju.txt");
FileOutputStream fos3=new  FileOutputStream("akash.txt");
int ch;
while((ch=fis.read())!=-1)
{
fos1.write((char)ch);
fos2.write((char)ch);
fos3.write((char)ch);
}
}
}
	