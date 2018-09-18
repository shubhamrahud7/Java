import java.io.*;
class SerializableDemo
{
public static void main(String args[])throws Exception
{
Student s=new Student(33,"naresh");
FileOutputStream fos=new FileOutputStream("nit.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(s);
oos.close();
}
}

