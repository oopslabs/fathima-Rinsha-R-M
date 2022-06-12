package co4;
import java.util.Scanner;
class mul extends Thread{
	public synchronized void run()
	{
		for(int i=1;i<11;i++) {
			System.out.println(i*5);
		}
	}
}
class prime extends Thread{
	public synchronized void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n prime numbers");
		int n=sc.nextInt();
		int p=0;
		for(int i=2;i<n;i++)
		{
			p=0;
			for(int j=2;j<i/2;j++) {
				if(i%j==0)
				{
					p=1;
				}
			}
			if(p==0)
			{
				System.out.println(i+"is prime");
			}
		}
	}
}
public class q5 {
	public static void main(String args[]) {
		
	
mul m=new mul();
prime p=new prime();
m.start();
p.start();
}
}
