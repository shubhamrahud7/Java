import java.io.*;
class  FileOutputStreamDemo
{
public static void main(String args[])throws Exception
{
DataInputStream dis=new DataInputStream(System.in);
FileOutputStream fos=new  FileOutputStream("anand.doc");
int ch;
while((ch=dis.read())!='$')
{
fos.write((char)ch);
}
}
}	