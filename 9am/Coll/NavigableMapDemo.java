import java.util.*;
class NavigableMapDemo
{
public static void main(String args[])
{
TreeMap<String,String>tm=new TreeMap<String,String>();
tm.put("15AG5A0406","amith");
tm.put("15AG5A0408","raju");
tm.put("15AG5A0401","pavan");
tm.put("15AG5A0405","balu");
tm.put("15AG5A0602","satya");
tm.put("15AG5A0605","vjay");
System.out.println(tm);
System.out.println(tm.ceilingKey("15AG5A0602"));
System.out.println(tm.higherKey("15AG5A0602"));
System.out.println(tm.floorKey("15AG5A0602"));
System.out.println(tm.lowerKey("15AG5A0602"));
System.out.println(tm.descendingKeySet());
}
}
