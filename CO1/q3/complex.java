package product;

	import java.util.*;
	public class complex {
	public static void main(String args[])
	{
		int r1,im1,r2,im2,r,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first complex number");
		System.out.println("enter the real part:");
		r1=sc.nextInt();
		System.out.println("enter the imaginary part:");
		im1=sc.nextInt();
		System.out.println(r1+"+"+im1+"i");
		System.out.println("enter the second complex number");
		System.out.println("enter the real part:");
		r2=sc.nextInt();
		System.out.println("enter the imaginary part:");
		im2=sc.nextInt();
		System.out.println(r2+"+"+im2+"i");
	    System.out.println("sum of two complex number are:");
	    r=r1+r2;
	    i=im1+im2;
	    System.out.println(r+"+"+i+"i");
		
	}
	}
