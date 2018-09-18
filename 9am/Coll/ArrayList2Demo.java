import java.util.*;
class  ArrayList2Demo
{
public static void main(String args[])
{
ArrayList<String> al=new  ArrayList<String>();
al.add("pavan");
al.add("raju");
al.add("sai");
System.out.println(al);
ArrayList<String> s1=(ArrayList<String>)al.clone();
System.out.println(s1);
al.add("balu");
al.add("mani");
al.add(null);
System.out.println(al);
System.out.println(s1);
}
}
