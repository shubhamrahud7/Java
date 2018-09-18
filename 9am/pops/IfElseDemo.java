import java.util.*;
class IfElseDemo 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter any no");
int n=sc.nextInt();
int a=n/100;
int b=n%100/10;
int c=n%10;
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);
int d=a*a*a+b*b*b+c*c*c;
if(n==d)
		{
	System.out.println("given no is arm strong no:"+d);
	}
else
		{
System.out.println("given no is not arm strong no:"+d);
		}
}
}
