class Emp
{
Emp()
{
System.out.println("welcome to emp");
}	
Emp(int empid)
{this();
System.out.println("empid="+empid);
}
}
class Mgt extends Emp
{
	Mgt()
	{
		System.out.println("welcome to sub");
	}
Mgt(int empid)
{     //this();
	super(empid);
System.out.println("welcome to mgt");
}
}
class SupConLevDemo
{
public static void main(String args[])
{
Mgt n=new Mgt(1234);
}
}		