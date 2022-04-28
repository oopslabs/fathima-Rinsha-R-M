package product;
import java.io.*;
import java.util.*;
	class emps{
		int eNo;
		String eName;
		float eSalary;
		void inputdata() throws IOException
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name ");
			eName=sc.nextLine();
			System.out.println("enter emp number:");
			eNo=sc.nextInt();
			System.out.println("enter your salary:");
			eSalary=sc.nextFloat();
	}
		void display()
		{
			System.out.println("Name:"+eName);
			System.out.println("emp no:"+eNo);
			System.out.println("salary:"+eSalary);
		}
}
	public class employee{
		public static void main(String args[]) throws IOException
		{
			int flag=0;
			emps e[]=new emps[10];
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no.of employees:");
			int eno=sc.nextInt();
			for(int i=0;i<eno;i++){
				e[i]=new emps();
				e[i].inputdata();
			}
			for(int i=0;i<eno;i++)
			{
				e[i].display();
			}
		System.out.println("enter the eno of employee to be searched");
		int en=sc.nextInt();
		for(int i=0;i<eno;i++)
		{
			if(e[i].eNo==en)
			{	
				 flag=1;
				System.out.println("employee found");
			}
				
		}
		if(flag==0)
		{
			System.out.println("employee not found");
		}
		
	
}
}

