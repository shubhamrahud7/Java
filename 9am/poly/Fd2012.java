class Fd2012
{
 void fd(long amount,double r,int t)
{
System.out.println("super class logic");	
double i=amount*t*r/100;
System.out.println("intrest amount="+i);
}
}
class Fd2016 extends Fd2012
{
void fd(long amount,double r,int t)
{
System.out.println("sub class logic");	
double i=amount*t*r/100;
System.out.println("intrest amount="+i);
}
}


