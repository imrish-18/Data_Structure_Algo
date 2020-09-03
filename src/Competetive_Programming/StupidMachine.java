package codeChef;
import java.util.Scanner;

public class StupidMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0,sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=Integer.MAX_VALUE;
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]<max)
		{
			max=arr[i];	
			
			sum=sum+max;
		}
		else
		{
			sum=sum+max;
		}
		
	}
		
			
		
		
System.out.println(sum);
	}

}
//
///* package codechef; // don't place package name! */
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
///* Name of the class has to be "Main" only if the class is public. */
//class Codechef
//{
//    public static int minimum(int a,int b)
//    {
//        if(a>b)
//        return b;
//        else
//        return a;
//    }
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		try {
//		    Scanner sc=new Scanner(System.in);
//		    int t=sc.nextInt();
//		    while(t-->0)
//		    {
//		        int n=sc.nextInt();
//		        long res=0;
//		        int m=1000000001;
//		        for(int i=0;i<n;i++)
//		        {
//		            int val=sc.nextInt();
//		            m=minimum(m,val);
//		            res+=m;
//		        }
//		        System.out.println(res);
//		    }
//		} catch(Exception e) {
//		} finally {
//		}
//	}
//}
