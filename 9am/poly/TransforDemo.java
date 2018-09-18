class TransforDemo
{
	double bal=2500000;
	int amount;
void balanceInfo()
{
System.out.println("present bal="+bal);
}	
void transfor(long acno,int amount)
{
if(acno==321456)
{	
bal=bal-amount;
System.out.println("amount transfored sus:"+acno+"\t"+amount);
balanceInfo();
}
else
{
System.out.println("invalid ac details");
}
}
void transfor(long acno,String ifsccode,int amount)
{
if(acno==123456789&& ifsccode.equalsIgnoreCase("HDFC2020"))
{	
bal=bal-amount;
System.out.println("amount transfored sus:"+acno+"\t"+amount);
balanceInfo();
}
else
{
System.out.println("invalid ac details");
}
}
}	