import java.util.*;
class  ArrayListDemo
{
public static void main(String args[])
{
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(45); 
al.add(65);
al.add(27);
al.add(49);
al.add(45); 
al.add(98);
al.add(96);
al.add(25);
al.add(3,45);
System.out.println("array elements"+al);
//System.out.println("subList="+al.subList(1,5));
}
}