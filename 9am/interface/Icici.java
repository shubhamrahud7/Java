import java.util.*;
class Icici implements FinAdv
{
int t;	
Icici(int t)
{
System.out.println("\t \t welcome to Icici bank");	
this.t=t;	
}
double i;
	public void fd()
	{
	switch(t)
	{
	case 1:
	{
	i=p*t*0.60/100;	
	System.out.println(t+"fd intrest amount="+i);
	break;
	}
case 3:
	{
	i=p*t*0.90/100;	
	System.out.println(t+"fd intrest amount="+i);
	break;
	}	
case 5:
	{
	i=p*t*0.95/100;	
	System.out.println(t+"fd intrest amount="+i);
	break;
	}	
default	:
System.out.println("contact manger");
	}		
	}
public void nd()
{
System.out.println("nd amount="+(p*t*0.40/100));	
}
}