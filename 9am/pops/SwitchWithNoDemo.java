import java.util.*;
class SwitchWithNoDemo
{
public static void main(String[] args) 
	{
Scanner balu=new Scanner(System.in);
System.out.println("enter loan amount u wanted");
double p=balu.nextDouble();
System.out.println("enter no of yr u wanted");
int t=balu.nextInt();
double i;
		switch(t)
		{
		case 1:
		{ 
			i=(p*t*1.50)/100;
System.out.println(t+"intrest amount="+i);
			break;
			}
			case 3:
		{ 
			i=(p*t*1.30)/100;
System.out.println(t+"intrest amount="+i);
			break;
			}
case 5:
		{ 
			i=(p*t*1.20)/100;
System.out.println(t+"intrest amount="+i);
			break;
			}
case 8:
		{ 
			i=(p*t*1.00)/100;
System.out.println(t+"intrest amount="+i);
			break;
			}
case 15:
		{ 
			i=(p*t*0.80)/100;
System.out.println(t+"intrest amount="+i);
			break;
			}
case 25:
		{ 
			i=(p*t*0.60)/100;
System.out.println(t+"intrest amount="+i);
			break;
			}
case 50:
		{ 
			i=(p*t*0.45)/100;
System.out.println(t+"intrest amount="+i);
			break;
			}
default:
System.out.println("our allows 1,3,5,8,15,25,50 yr only");
		}
	}
}
