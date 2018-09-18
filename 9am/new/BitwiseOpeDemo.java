import java.util.*;
class BitwiseOpeDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any 2 int no");
int x=sc.nextInt();		
int y=sc.nextInt();
System.out.println("bit wise and="+(x&y));
System.out.println("bitwise or="+(x|y));
System.out.println("bitwise not="+(~x));
System.out.println("bitwise Xor="+(x^y));
System.out.println("bitwise leftshift="+(x<<2));
System.out.println("bitwise r shift="+(x>>2));
System.out.println("bitwise r shift fill zero="+(x>>>2));
}
}