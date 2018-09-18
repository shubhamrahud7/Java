class VarargsExample
{ 
 void display(String... values)
{  
   for(String s:values)  // for each loop
{  
System.out.println(s);  
	  }  
 }  
 public static void main(String args[])
{  
VarargsExample v=new VarargsExample();
	  v.display();//zero argument   
	 v.display("hello");//one argument   
	v.display("my","name","is","varargs");
	 }   
}  