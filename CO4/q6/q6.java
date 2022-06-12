package co4;
import java.util.Scanner;
class even implements Runnable{
	int s;
	even(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the even number");
		 s=sc.nextInt();
	}
	public synchronized void run() {
		System.out.println("even numbers");
		for(int i=0;i<s;i++) {
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
class fib implements Runnable{
	int l;
	fib(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the fibnocci numbers");
	 l=sc.nextInt();
	}
	public synchronized void run()
	{
		System.out.println("fibnocci");
		
		int a=0,b=1,c=0;
	System.out.println(a);
	System.out.println(b);
		while((a+b)<l)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
public class q6 {
public static void main(String args[])
{
	even obj1=new even();
	fib obj2=new fib();
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	t1.start();
	t2.start();
}
}
