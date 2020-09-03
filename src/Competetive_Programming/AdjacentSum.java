package com.codeForces;
import java.util.Scanner;
public class AdjacentSum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and coloumn of array");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int count=0;
		System.out.println("enter the vales into array");
		
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				arr[i][j]=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]>0 && (j<m-1 && (arr[i][j+1]>0)))
						{
					count+=1+1;
					arr[i][j]=-1;
					arr[i][j+1]=-1;
						}
				
				else if(arr[i][j]>0 && i<n-1 && arr[i+1][j]>0)
				{
					count=count+1+1;
					arr[i][j]=-1;
					arr[i+1][j]=-1;
				}

				else if(arr[i][j]>0 && j<m-1 && arr[i][j+1]<0)
				{

					count=count+1;
				}
			
				if(arr[i][j]<0 && j<m-1 && arr[i][j+1]>0)
				{

					count=count+1;
					
					arr[i][j+1]=-1;
				}
				if(arr[i][j]<0 && i<n-1 && arr[i+1][j]>0)
				{
					count=count+1;
					arr[i+1][j]=-1;
				}
				
				}	
		System.out.println(count);
	}

}
