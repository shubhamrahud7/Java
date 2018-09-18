import java.util.*;
import java.io.*;
class Cust
{
String cname;
static final long acno=123456789;
int cid;
double bal=5000;	
long facno=23456;
int amount;
String ifsccode="sbin000045";
Scanner sc=new Scanner(System.in);
void input()
{
System.out.println("enter cid=");
cid=sc.nextInt();
System.out.println("enter cname");
cname=sc.next();	
}
void output()
{
System.out.println("cust id="+cid);
System.out.println("cust name="+cname);
}
void balnceInfo()
{
System.out.println("present bal="+bal);	
}
void transfor()
{
System.out.println("enter acno u wanted transfor");
long facno1=sc.nextLong();
System.out.println("enter ifsccode");
String ifsccode1=sc.next();
if(facno==facno1&&ifsccode.equals(ifsccode1))
{
System.out.println("enter amount u wanted to transfor");	
amount=sc.nextInt();
 if(amount<=bal)
 {
	bal=bal-amount;
System.out.println("amount transfored to:"+facno+"\t"+amount);
	balnceInfo();
 }
 else
 {
System.out.println("insuf funds to transfor");
balnceInfo();	 
 }
}
else
{
System.out.println("invalid ac info");	
}	
}
}
class BankOffice extends Cust
{
void deposit()
{
System.out.println("enter amount u wanted to deposit");
amount=sc.nextInt();
bal=bal+amount;
balnceInfo();	
}
void withdraw()
{
System.out.println("enter amount u wanted to withdraw");
amount=sc.nextInt();
bal=bal-amount;
balnceInfo();
}
}
class BankManger extends BankOffice
{
void grantloan()
{
System.out.println("elg long="+(bal*80/100));	
}
}
class BankOpeDemo
{
Scanner sc=new Scanner(System.in);
Console c=System.console();	
void login()
{
System.out.println("enter cid");
String cid=sc.next();
System.out.println("enter password");
char pass[]=c.readPassword();
String s1=new String(pass);
if(cid.equals("cust")&&s1.equals("password"))
{
Cust c1=new Cust();
c1.input();
c1.output();
c1.balnceInfo();
c1.transfor();
//c1.deposit();
//c1.withdraw();	
}	
else if(cid.equals("officer")&&s1.equals("admin"))
{
BankOffice bo=new BankOffice();
bo.input();
bo.output();
bo.balnceInfo();
bo.transfor();
bo.deposit();
bo.withdraw();	
}
else if(cid.equalsIgnoreCase("Manager")&&s1.equals("admin"))
{
BankManger bm=new BankManger();
bm.input();
bm.output();
bm.balnceInfo();
bm.transfor();
bm.deposit();
bm.withdraw();	
bm.grantloan();
}
else
{
System.out.println("in valid login");	
}
}
public static void main(String args[])
{
BankOpeDemo bo=new BankOpeDemo();
bo.login();
}
}	