package co4;
import java.util.Scanner;
class pos extends Exception{
	pos(String mssg)
	{
		super(mssg);
	}
}
public class q4 {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size/limit");
	int s=sc.nextInt();
	int avg=0,t=0,m=s;;
	for(int i=0;i<s;i++)
	{
		try {
		
		 t=sc.nextInt();
	
	
		if(t<0)
		{
			s++;
			throw new pos("it is an negtaive number");
		}
		else {
			avg+=t;
		}
	}catch(pos e) {
		System.out.println(e.getMessage());
	}
	}
	System.out.println("avg:"+avg/m);

}
}