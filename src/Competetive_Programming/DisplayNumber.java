package com.codeForces;
import java.util.Scanner;

public class DisplayNumber {

	public static void  main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long t=sc.nextInt();
	while(t!=0) {
		long n=sc.nextInt();
		if(n==2)
			System.out.println(2);
		else if(n==3)
			System.out.println(7);
		else if(n%2==0)
		{
			long num=0;
			for(int i=1;i<=n/2;i++)
				num=num*10+1;
			System.out.println(num);
		}
		else
		{
			long num=0;
			num=num*10+7;
			for(int i=1;i<=(n/2-1);i++)
				num=num*10+1;
			System.out.println(num);
		}
		t--;
	}
		
	}
}
