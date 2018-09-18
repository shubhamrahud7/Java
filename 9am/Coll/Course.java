class Course
{
int dur;
int fee;
String cname;
final int regfee=100;
Course(int dur,int fee,String cname)
{
this.dur=dur;
this.cname=cname;
this.fee=fee;
}
void info()
{
System.out.println("dur="+dur);
System.out.println("cname="+cname);
System.out.println("fee="+fee);
System.out.println("regfee="+regfee);
}
}