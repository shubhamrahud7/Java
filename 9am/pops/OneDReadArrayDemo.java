import java.util.*;
class OneDReadArrayDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
int n=sc.nextInt();	
int marks[]=new int[n] ;
System.out.println("enter Array elements");
for(int i=0;i<n;i++)
{
marks[i]=sc.nextInt();
}
System.out.println("Array elements are");
for(int i=0;i<n;i++)
{
System.out.print(marks[i]+"\t");
}
}	
}