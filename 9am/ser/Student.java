import java.io.*;
class Student implements Serializable
{
 int sid;        //suport ser
String sname;
Student(int sid,String sname)
{
this.sid=sid;
this.sname=sname;
}
public void displayInfo()
{
System.out.println("sid="+sid);
System.out.println("sname="+sname);
}
}


//transient int sid;// not suports ser process