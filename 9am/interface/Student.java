class Student
{
public static void main(String args[])throws Exception
{
Class c=Class.forName(args[0]);
Nit s1=(Nit)c.newInstance();
s1.courseInfo();
s1.placementInfo();
}
}	