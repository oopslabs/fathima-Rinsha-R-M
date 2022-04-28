package product;	
	import java.util.*;
	public class matrix2 {
	public static void main(String args[])
	{
		int r,i,j,flag;
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of roes and cols:");
		r=sc.nextInt();
		System.out.println("enter elements in matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("transpose of a matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		flag=1;
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				if(a[i][j]!=b[i][j])
				{
					flag=0;
					break;
				}
			}
		}
		
		if(flag==1)
		{
			System.out.println("symmetric");
		}
		else
		{
			System.out.println(" not symmetric");
		}
	}

	}

