import java.util.*;
class DequeDemo
{
public static void main(String args[])
{
LinkedList<Number> ll=new LinkedList<Number>();
ll.add(25);
ll.add(5.6);
ll.add(525);
ll.add(75.62);
ll.add(-45);
ll.add(null);
System.out.println("stu Info:");
//Iterator it=ll.descendingIterator();
Iterator it=ll.iterator();
while(it.hasNext())
{
System.out.print(it.next()+"\t");
}	
}
}