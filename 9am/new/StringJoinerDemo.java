import java.util.*;
class StringJoinerDemo
{
public static void main(String args[])
{
StringJoiner sj = new StringJoiner(":", "{", "]");
 sj.add("pavan").add("ravi").add("raju");
System.out.println(sj);
System.out.println(sj.length());
StringJoiner sj1 = new StringJoiner("$", "@@", "%%");
 sj1.add("facebook").add("whatsup").add("google");
System.out.println(sj1);
sj.merge(sj1);
System.out.println(sj);
 }
} 