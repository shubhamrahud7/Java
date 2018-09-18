import java.util.*;
class CompareDemo
{
public static void main(String args[])
{
int age=22;	
Scanner sc=new Scanner(System.in);
System.out.println("enter age:");
int n=sc.nextInt();
int x=Integer.compare(age,n);
System.out.println("compare="+x);
if(x==0)
{
System.out.println("enter correct data");	
}
else if(x==-1)
{
System.out.println("enter grate age value");		
}
else{
System.out.println("enter less age");
}		
}
}
