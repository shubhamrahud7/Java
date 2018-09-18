import java.util.*;
class VectorDemo
{
public static void main(String args[])
{
Vector<String> v=new Vector<String>();
v.add("fz");
v.add("ktm");
v.add("honda");
v.add("hero");
v.add("bajaj");
v.add("fz");
v.add(0,"BMW");
/*v.add("hero");
v.add("bajaj");
v.add("fz");
v.add("activa");*/
System.out.println(v.capacity());
System.out.println("output based on S.O.P");
System.out.println(v);
System.out.println("output based on Enumeration");
Enumeration e=v.elements();
while(e.hasMoreElements())
{
System.out.print(e.nextElement()+"\t");	
}
System.out.println("\n output based on Iterator");
Iterator it=v.iterator();
while(it.hasNext())
{
System.out.print(it.next()+"\t");	
}
System.out.println("\n output based on listIterator forward dir");
ListIterator li=v.listIterator();	
while(li.hasNext())
{
System.out.print(li.next()+"\t");	
}
System.out.println("\n output based on listIterator backward dir");
while(li.hasPrevious())
{
System.out.print(li.previous()+"\t");	
}
System.out.println("\noutput based on for each loop");
for(String s:v)
{
	System.out.print(s+"\t");
}
System.out.println("\noutput based on for loop");
for(int i=0;i<v.size();i++)
{
System.out.print(v.get(i)+"\t");
}

}
}




	