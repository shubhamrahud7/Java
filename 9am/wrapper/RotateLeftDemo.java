import java.util.*;
class RotateLeftDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any no:");
int n=sc.nextInt();
System.out.println("enter Rote distance:");
int m=sc.nextInt();
System.out.println(Integer.rotateLeft(n,m));
}
}
