import java.util.*;
import java.io.*;
class Bank
{
int bal=5000;
int amount;
void balnceInfo()
{
System.out.println("present bal="+bal);
}
Scanner sc=new Scanner(System.in);
Console c=System.console();
void login()
{
String uname=c.readLine("enter username:");
System.out.println("enter password");
char pass[]=c.readPassword();
String s2=new String(pass);
if(uname.equals("cust")&&s2.equals("cust"))
{
m1();
balnceInfo();
//deposit();
//withdraw();
}
if(uname.equals("admin")&&s2.equals("admin"))
{
m1();
balnceInfo();
BankOfficer bo=new BankOfficer();
bo.deposit();
bo.withdraw();
}
}
void m1()
{
System.out.println("welcome to cust");
}

		class BankOfficer
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
}