import java.io.*;
class ByteArrayOutputStreamDemo
{
public static void main(String args[])throws Exception
{
ByteArrayOutputStream bos=new ByteArrayOutputStream();
FileOutputStream fos=new FileOutputStream("cardinfo.txt");
	bos.write(7895);
	bos.writeTo(fos);	bos.write(0456);
	bos.writeTo(fos);
	bos.write(7523);
	bos.writeTo(fos);
	bos.write(1200);
	bos.writeTo(fos);
}
}