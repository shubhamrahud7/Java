import java.io.*;
class DeSerializableDemo
{
public static void main(String args[])throws Exception
{
FileInputStream fis=new FileInputStream("nit.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Object x=ois.readObject();
Student s=(Student)x;
s.displayInfo();
//ois.close();
}
}

