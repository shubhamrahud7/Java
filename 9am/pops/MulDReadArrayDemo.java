import java.util.*;
class MulDReadArrayDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter row size");
int n=sc.nextInt();	
System.out.println("enter col size");
int m=sc.nextInt();	
int marks[][]=new int[n][m];
System.out.println("enter Array elements");
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
marks[i][j]=sc.nextInt();
}
}
System.out.println("Array elements are");
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
System.out.print(marks[i][j]+"\t");
}
System.out.println();
}
}	
}