import java.util.*;
class TreeSetDemo
{
public static void main(String args[])
{
TreeSet<Number> hs=new TreeSet<Number>();	
hs.add(45);
hs.add(89);
hs.add(56);
hs.add(95);
hs.add(82);
hs.add(56);
//hs.add(2,75);
//hs.add(null);
Iterator it=hs.iterator();
while(it.hasNext())
{
System.out.print(it.next()+"\t");
}
}
}