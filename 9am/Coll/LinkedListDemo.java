import java.util.*;
class LinkedListDemo
{
public static void main(String args[])
{
LinkedList<String> ll=new LinkedList<String>();	
ll.add("satya");
ll.add("vamshi");
ll.add("balu");
ll.add("naresh");
System.out.println(ll);
ll.add(1,"asdf");
System.out.println(ll);
LinkedList<String> cc=new LinkedList<String>();	
cc.add("java");
cc.add("oracle");
cc.add("html");
System.out.println(cc);
cc.addAll(ll);
cc.addAll(2,ll);
System.out.println(cc);
ll.addFirst("venkat");
ll.add("satya");
System.out.println(ll);
boolean b=ll.contains("pavan");
if(b==true)
{
	System.out.println("obj is avl");
}
else
{
	System.out.println("obj is not val");
}
System.out.println("first ele="+ll.peek());
System.out.println(ll);
System.out.println("first ele="+ll.poll());
System.out.println(ll);
System.out.println("3 index element="+ll.get(3));
System.out.println("getFirst="+ll.getFirst());
	System.out.println(ll.indexOf("satya"));
	System.out.println(ll.lastIndexOf("satya"));
	ll.remove();
	ll.remove(4);
	ll.remove("satya");
	ll.set(5,"Laxmi");
System.out.println(ll);	
ll.clear();
System.out.println(ll);
}
}