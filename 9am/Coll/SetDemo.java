import java.util.*;
class SetDemo
{
public static void main(String args[])
{
Course c1=new Course(55,1000,"corejava");
Course c2=new Course(180,1200,"advjava");
Course c3=new Course(180,1000,"oracle");
Course c4=new Course(25,10000,"RPA");
Course c5=new Course(10,250000,"Blackchain");
ArrayList<Course>al =new ArrayList<Course>();
al.add(c1);
al.add(c5);
al.add(c2);
al.add(c4);
al.add(0,c3);
//al.add(null);
al.add(c2);
al.add(c3);
HashSet<Course> hs=new HashSet<Course>();
hs.add(c1);
hs.add(c2);
hs.add(c3);
hs.add(c4);
hs.add(c5);
hs.add(c4);
hs.add(c2);
System.out.println("output of arraylist");
System.out.println("dur"+"\t name"+"\t fee");
for(Course b:al)
{
System.out.print(b.dur+"\t"+b.cname+"\t"+b.fee);	
System.out.println();
}
System.out.println("output of HashSet");
System.out.println("dur"+"\t name"+"\t fee");
for(Course b:hs)
{
System.out.print(b.dur+"\t"+b.cname+"\t"+b.fee);	
System.out.println();
}

}
}