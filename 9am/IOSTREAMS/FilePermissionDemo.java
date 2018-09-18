import java.io.*;
class FilePermissionDemo
{
public static void main(String args[])
{
FilePermission fp=new FilePermission("C:/Users/nit/Desktop/9am/IOSTREAMS/resume.doc","read");
FilePermission fp1=new FilePermission("resume.doc","write");
FilePermission fp3=new FilePermission("resume.doc","delete");
System.out.println("fp getActions="+fp.getActions());
}
}

	