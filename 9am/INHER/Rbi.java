interface Sbi
{
double bal=450000;
}
interface Icici
{
double bal=500000;
}
interface Boi
{
double bal=950000;
}
class Rbi implements Sbi,Icici,Boi
{
	void totBalnceInfo()
	{
	double totbal=Sbi.bal+Icici.bal+Boi.bal;	
	System.out.println("tot bal="+totbal);
	}
	public static void main(String args[])
	{
	Rbi r=new Rbi();
r.totBalnceInfo();
	}	
}
