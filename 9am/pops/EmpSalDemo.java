import java.util.*;
class EmpSalDemo 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter basic sal");
int bsal=sc.nextInt();
double ta,da,hra,tax,pf,netsal;
assert bsal>0:"invalid entry:";
if(bsal>0&&bsal<=10000)
{
	ta=bsal*8/100;
	da=bsal*12/100;
	hra=bsal*15/100;
	tax=bsal*2/100;
	pf=bsal*5/100;
}
else if(bsal>10000&&bsal<=20000)
{
	ta=bsal*6/100;
	da=bsal*10/100;
	hra=bsal*12/100;
	tax=bsal*3/100;
	pf=bsal*4/100;
}
else if(bsal>20000&&bsal<=30000)
{
	ta=bsal*4/100;
	da=bsal*4/100;
	hra=bsal*4/100;
	tax=bsal*10/100;
	pf=bsal*3/100;
}
else 
{
	ta=bsal*3/100;
	da=bsal*3/100;
	hra=bsal*3/100;
	tax=bsal*15/100;
	pf=bsal*3/100;
}
netsal=bsal+ta+hra+da-tax-pf;
System.out.println("bsal="+bsal);
System.out.println("TA="+ta);
System.out.println("DA="+da);
System.out.println("Hra="+hra);
System.out.println("Tax="+tax);
System.out.println("PF="+pf);
System.out.println("TAKEHOME="+netsal);
	}
}