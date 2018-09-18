class Nit
{
int regfee=100;
String cname="corejava";
int dur=45;
int fee=1000;
}
class Anath extends Nit
{
int regfee=500;
String cname="corejava";
int dur=360;
int fee=25000;	
void courseInfo()
{
System.out.println("regfee="+regfee);//500
System.out.println("regfee="+super.regfee); //100
System.out.println("cname="+cname);
System.out.println("dur="+dur);  //360
System.out.println("dur="+super.dur);// 45
System.out.println("fee="+fee);
}
}
class SupVarDemo
{
public static void main(String args[])
{
Anath a=new Anath();
a.courseInfo();
}
}