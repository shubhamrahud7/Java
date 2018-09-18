import java.util.*;
class BitCountDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any no:");
int n=sc.nextInt();
int x=Integer.bitCount(n);
System.out.println("no of 1 bits="+x);
}
}	