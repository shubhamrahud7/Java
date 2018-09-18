import java.io.*;
class FileDemo
{
public static void main(String args[])throws Exception
{
File f=new File("resume.doc");
boolean b=true;
b=f.createNewFile();
System.out.println("file created");
//f.delete();
boolean c=f.canExecute();
if(c==true)
{
System.out.println("exe per are there");
}
else
{
	System.out.println("exe per are not there");
}
boolean	d=f.canRead();
if(d==true)
{
System.out.println("read per are there");
}
else
{
System.out.println("read per are not there");
}
boolean e=f.canWrite();
if(e==true)
{
System.out.println("write per are there");
}
else
{
System.out.println("write per are not there");
}
boolean g=f.exists();
if(g==true)
{
System.out.println("file is avl");
}
else
{
System.out.println("file is not avl");
}
boolean	h=f.isHidden();
if(h==true)
{
System.out.println("file is hidden ");
}
else
{
System.out.println("file is not not hidden");
}
boolean	i=f.isDirectory();
if(i==true)
{
System.out.println("it is folder ");
}
else
{
System.out.println("it is not folder");
}
System.out.println(f.getPath());
System.out.println(f.getAbsolutePath());
System.out.println(f.getFreeSpace());
}
}