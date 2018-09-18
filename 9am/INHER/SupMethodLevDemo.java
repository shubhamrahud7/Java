class Teacher 
{
void exams()
{
System.out.println("get ready for exams");
}
}
class Ajay extends Teacher
{
void exams()
{
System.out.println("exams are over");
}	
void examsInfo()
{
exams();
super.exams();
}
}
class SupMethodLevDemo
{
public static void main(String args[])
{
Ajay a=new Ajay();
a.examsInfo();
}
}	
		