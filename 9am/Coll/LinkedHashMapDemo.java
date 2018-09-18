import java.util.*;
class LinkedHashMapDemo
{
public static void main(String args[])
{
LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
hm.put("15AG5A0406",100);
hm.put("15AG5A0408",58);
hm.put("15AG5A0401",90);
hm.put("15AG5A0405",58);
hm.put("15AG5A0602",null);
hm.put(null,99);
System.out.println(hm);
}
}