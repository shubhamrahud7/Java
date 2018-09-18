import java.util.*;
class StackDemo
{
public static void main(String args[])
{
//Stack st=new Stack();
Stack<String> st=new Stack<String>();
st.push("c with ds");
st.push("rdbms");
st.push("java");
//st.push(37);
st.push("rpa");
st.push(null);
System.out.println(st);
boolean b=st.empty();
if(b==true)
{
System.out.println("stack is empty");	
}
else
{
System.out.println("stack is not empty");	
}
System.out.println("top="+st.peek());
st.pop();
System.out.println(st);
System.out.println("top="+st.peek());
int n=st.search("pega");
System.out.println("serch value="+n);
}
}