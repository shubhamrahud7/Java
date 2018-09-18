import java.util.*;
class LinkedList1Demo
{
public static void main(String args[])
{
Bike b1=new Bike(35,"royal2020",550,125568.97);	
Bike b2=new Bike(65,"spl2018",150,55568);	
Bike b3=new Bike(100,"Act 5g",250,65568.97);	
Bike b4=new Bike(55,"Fz2020",250,89568.97);	
Bike b5=new Bike(200,"Elc2020",100,15568.97);	
LinkedList<Bike>ll =new LinkedList<Bike>();
ll.add(b1);
ll.add(b3);
ll.add(b2);
ll.add(b4);
ll.addFirst(b5);
System.out.println("cc"+"\t model"+"\t mil"+"\tprice");
for(Bike b:ll)
{
System.out.print(b.cc+"\t"+b.model+"\t"+b.mil+"\t"+b.price);	
System.out.println();
}
}
}