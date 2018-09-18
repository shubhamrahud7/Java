import java.io.*;
class ManyToOneDemo
{
public static void main(String args[])throws Exception
{
FileInputStream fis1=new FileInputStream("D:/Myeclipsekey2017.txt");	
FileInputStream fis2=new FileInputStream("D:/rajufiles/Atm.txt");
FileInputStream fis3=new FileInputStream("C:/Users/nit/Desktop/vekat.doc");
FileOutputStream fos1=new  FileOutputStream("C:/Users/nit/Desktop/Myoutput.doc");
int ch;
while((ch=fis1.read())!=-1)
{	
fos1.write((char)ch);
}
while((ch=fis2.read())!=-1)
{	
fos1.write((char)ch);
}

while((ch=fis3.read())!=-1)
{	
fos1.write((char)ch);
}
}
}