import java.util.*;
class SumArrayDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter row size");
int n=sc.nextInt();	
System.out.println("enter col size");
int m=sc.nextInt();	
int internalmarks[][]=new int[n][m];
System.out.println("enter internal marks");
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
internalmarks[i][j]=sc.nextInt();
}
}
int externalmarks[][]=new int[n][m];
System.out.println("enter external marks");
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
externalmarks[i][j]=sc.nextInt();
}
}
System.out.println("internalmarks are:");
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
System.out.print(internalmarks[i][j]+"\t");
}
System.out.println();
}
System.out.println("externalmarks are:");
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
System.out.print(externalmarks[i][j]+"\t");
}
System.out.println();
}
System.out.println("sum marks are:");
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
int totmarks[][]=new int[n][m];
totmarks[i][j]=internalmarks[i][j]+externalmarks[i][j];		
System.out.print(totmarks[i][j]+"\t");
}
System.out.println();
}
}	
}