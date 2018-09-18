import java.io.*;
import java.util.*;
class Atm
{
Scanner sc=new Scanner(System.in);
Console c=System.console();
int pinno=1234;
long acno=123456789;
int amount;
double bal=5000;
long facno=789456;
String Ifsccode="sbin00045";
long mno=652341;
int otp;
void balanceInfo()
{
System.out.println("present bal="+bal);
}
void validate()
{
System.out.println("enter pinno");
char pass[]=c.readPassword();
String s1=new String(pass);
int pinno1=Integer.parseInt(s1);
if(pinno==pinno1)
{
System.out.println("pin validated sus");
}
else
{
System.out.println("in valid pin no");
System.exit(0);
}
}
void deposit()
{
validate();
System.out.println("enter acno:");
long acno1=sc.nextLong();
if(acno==acno1)
{
System.out.println("ac details are  matched");
System.out.println("enter amount u wanted to deposit");
amount=sc.nextInt();
bal=bal+amount;
balanceInfo();
}
else
{
System.out.println("invalid acdetails");
System.out.println("retry");
 deposit();
}
}
void withdraw()
{
validate();
System.out.println("enter amount u wanted to withdraw());
amount=sc.nextInt();
if(amount<=bal)
{
bal=bal-amount;
System.out.println("coll cash:"+amount);
balanceInfo();
}
else
{
System.out.println("in suf funds");
balanceInfo();
}
}
void pinnchange()
{
validate();
System.out.println("enter new pinno");
int pinno2=sc.nextInt();
System.out.println("re enter new pinno");
int pinno3=sc.nextInt();
if(pinno2==pinno3)
{
pinno=pinno2;
System.out.println("pinchanged sus");
}
else
{
System.out.println("pin detals are not matched");
}
}
void transfor()
{
validate();
System.out.println("enter facno");
long facno1=sc.nextLong();
System.out.println("enter ifsccode");
String ifsccode1=sc.next();
if(facno==facno1 && ifsccode.equals(ifsccode1))
{
System.out.println("enter amount u wanted to transfor");
amount=sc.nextInt();
     if(amount<=bal)
	 {
	 bal=bal-amount;
	 System.out.println("amount transfored sus:"+amount);
	 balanceInfo();
	 }
	 else
	 {
	 System.our.println("in suf funds to transfor");
	 balanceInfo();
	 }
}
else
{
System.out.println("invalid ac info");
}
}
void adLink()
{
validate();
System.out.println("enter adno");
long adno=sc.nextLong();
System.out.println("adno update sus");
}
void mobileUpdate()
{
validate();
System.out.println("enter old mobile no");
long mno1=sc.nextLong();
if(mno==mno1)
{
System.out.println("details are matched");
genOtp();
System.out.println ("enter otp u got");
int otp1=sc.nextInt();
if(otp==otp1)
{
System.out.println("enter new mobile no");
long mno1=sc.nextLong();
System.out.println("re enter new mobile no");
long mno2=sc.nextLong();
      if(mno1==mno2)
	  {
	  mno=mno1;
	  System.out.println("mno update sus");
	  }
	  else
	  {
	  System.out.println("mobile no not matched");
	  }
}	
else
{
System.out.println("otp not not matched");
}
}
else
{
System.out.println("old mno is not matched");
}
}
void genOtp()
{
double x=100000*Math.random();
otp=(int)x;
System.out.println("otp u got="+otp);
}
void exit()
{
System.exit(0);
}
}
class AtmUser
{
public static void main(String args[])
{
}
}










