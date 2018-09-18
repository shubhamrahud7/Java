import java.util.*;
class IDbi implements FinAdv
{
int t;	
IDbi(int t)
{
System.out.println("\t \t welcome to IDbi bank");	
this.t=t;	
}
double i;
	public void fd()
	{
	switch(t)
	{
	case 1:
	{
	i=p*t*0.40/100;	
	System.out.println(t+"fd intrest amount="+i);
	break;
	}
case 3:
	{
	i=p*t*0.80/100;	
	System.out.println(t+"fd intrest amount="+i);
	break;
	}	
case 5:
	{
	i=p*t*1.25/100;	
	System.out.println(t+"fd intrest amount="+i);
	break;
	}	
default	:
System.out.println("contact manger");
	}		
	}
public void nd()
{
System.out.println("nd amount="+(p*t*0.80/100));	
}
}