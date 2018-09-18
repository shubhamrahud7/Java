import java.io.*;
class OtpDemo
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i=1;
while(i<=3)
{
double x=10000*Math.random();		
int otp=(int)x;
System.out.println(otp);
System.out.println("enter otp u got");
int otp1=Integer.parseInt(br.readLine());
if(otp==otp1)
{
	System.out.println("ok");
	System.exit(0);
}
else
{
System.out.println("invalid otp");
i++;
}
}
Thread.sleep(45000);
}
}