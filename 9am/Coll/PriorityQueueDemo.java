import java.util.*;
class PriorityQueueDemo
{
public static void main(String args[])
{
PriorityQueue<Double>pq=new PriorityQueue<Double>();
pq.add(5.6);
pq.add(5.9);
pq.add(5.6);
pq.add(5.5);
pq.add(5.2);
pq.add(5.4);
pq.add(5.0);
//pq.add(null);
System.out.println("stu hig:");
Iterator it=pq.iterator();
while(it.hasNext())
{
System.out.print(it.next()+"\t");
}
}
}	