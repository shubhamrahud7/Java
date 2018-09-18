import java.util.*;
class Sum
{
Sum(int x,int y)
{
int z=x+y;
System.out.println("sum="+z);
}
}
class ParamConDemo
{
public static void main(String args[])
{	
Scanner sc=new Scanner(System.in);
System.out.println("enter x value");
int x=sc.nextInt();
System.out.println("enter y value");
int y=sc.nextInt();
Sum s1=new Sum(x,y);
}
}