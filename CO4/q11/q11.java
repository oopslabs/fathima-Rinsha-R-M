package co4;
import java.util.LinkedList;
import java.util.Scanner;
public class q11 {
	public static void main(String args[]) {
		
LinkedList<String> link=new LinkedList<>();
link.add("hello");
link.add("everyone");
link.add("hope");
link.add("you");
link.add("are");
link.add("good");
for(String p:link)
	System.out.println(p+"");
link.clear();
System.out.println("Linkedlist:"+link);



}
}