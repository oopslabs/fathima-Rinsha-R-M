package co4;
import java.util.Scanner;
class auth extends Exception{
	auth(String msg){
		super(msg);
	}
}
public class q3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String p,u;
	System.out.println("enter the username");
	u=sc.nextLine();
	System.out.println("enter the password");
	p=sc.nextLine();
	try {
		if(u.length()<8) {
			throw new auth("username length less than 8");
		}
		else if(p.length()<8)
		{
			throw new auth("password length less than 8");
		}
		else
		{
			System.out.println("login successfull");
		}
	   }catch(auth e)
	{
		   System.out.println(e.getMessage());
	}
}}