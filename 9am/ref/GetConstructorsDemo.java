public class GetConstructorsDemo
{
public static void printInterfaces(String name)throws Exception
 {
 Class c=Class.forName(name);
 Class i[]=c.getConstructors();
 System.out.println("the interface names are");
 for(int x=0;x<i.length;++x)
 {
  String iname=i[x].getName();
System.out.println("\t\t"+iname);
   }
}		   
public static void main(String args[])throws Exception
{ printInterfaces(args[0]);
}
}

   //>javac App3.java
    // java App3 Rbi	
   //>java App3 java.lang.String
   //>java App3 java.awt.Button