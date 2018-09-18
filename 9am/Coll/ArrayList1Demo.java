import java.util.*;
class  ArrayList1Demo
{
public static void main(String args[])
{
ArrayList<String>al=new ArrayList<String>();
al.add("15BD5A0523");
al.add("15BD5A0575");
al.add("15BD5A0585");
al.add("15BD5A0520");
al.add("15BD5A0501");
al.add("15BD5A05A6");
System.out.println(al);
//Collections.reverse(al);
//Collections.shuffle(al);
Collections.sort(al);
System.out.println(al);
}
}