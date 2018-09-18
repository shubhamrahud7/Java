import java.util.*;
class Hdfc implements FinAdv
{
double i;
	public void fd(int t)
	{
	switch(t)
	{
	case 1:
	{
	i=p*t*0.65/100;	
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
	i=p*t*1.00/100;	
	System.out.println(t+"fd intrest amount="+i);
	break;
	}	
default	:
System.out.println("contact manger");
	}		
	}
public void nd(int t)
{
System.out.println("nd amount="+(p*t*0.30/100));	
}
}