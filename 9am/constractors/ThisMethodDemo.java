import java.util.*;
class Student
{
String name;
int age;
Scanner sc=new Scanner(System.in);
void input()
{
System.out.println("enter name of the student");
name=sc.nextLine();	
System.out.println("enter age of the student");
age=sc.nextInt();
}
void m1()
{
	System.out.println("instance method");
}
void output()
{
	this.input();
System.out.println("name="+name);
System.out.println("age="+age);
this.m1();
}
}
class ThisMethodDemo
{
public static void main(String args[])
{
Student s1=new Student();
s1.output();
}
}	


