class Course
{
Course()
{
System.out.println("welcome to nit");
}
Course(int dur,String name)
{
	this();
System.out.println("course name="+name);
System.out.println("course dur="+dur);
}
Course(String date,int fee)
{
	this(60,"corejava");
System.out.println("course fee="+fee);
System.out.println("course s date="+date);
}
Course(int regfee,String fname,String loc)
{
this("28/07/2018",3500);	
System.out.println("course fname="+fname);
System.out.println("course reg="+regfee);
System.out.println("course loc="+loc);
}
}