class CmdSumDemo 
{
	public static void main(String[] args) 
	{
		String s1=args[0];
		int n=Integer.parseInt(s1);
		String s2=args[1];
		int m=Integer.parseInt(s2);
		int s3=n+m;
		System.out.println("sum="+s3);
	}
}
// javac CmdSumDemo.java
// java CmdSumDemo 10 20