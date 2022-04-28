package product;
import java.util.*;
import java.io.*;
public class manipul {
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		System.out.println("length is:"+str.length());
		System.out.println("character at position 5 is: "+str.charAt(5));
		System.out.println("Compare function:"+str.compareTo("hi"));
		System.out.println("The index of a is: "+str.indexOf('a'));
		System.out.println("Contain function: "+str.contains("hi"));
		System.out.println("endswith function: "+str.endsWith("p"));

}
}
