import java.util.*;
import static java.lang.Integer.*;
class ConvertDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any no:");
int n=sc.nextInt();
System.out.println("toBinaryString="+toBinaryString(n));
System.out.println("toHexString="+toHexString(n));
System.out.println("toOctalString="+toOctalString(n));
System.out.println("toString="+Integer.toString(n));
}
}