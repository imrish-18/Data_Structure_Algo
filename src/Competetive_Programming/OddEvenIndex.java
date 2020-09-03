package com.codeForces;

import java.util.Scanner;
public class OddEvenIndex {

	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		int temp=0;
		int i=0;
		System.out.println("enter the lenght of the array");
		int len=sc.nextInt();
		int[] arr=new int[len];
		System.out.println("enter the element into array");
		for( i=0;i<len;i++)
			arr[i]=sc.nextInt();
		for(i=0;i<len-1;)
		{
			if(i%2==0 && arr[i]%2!=0)
			{
				temp=arr[i];
				for(int j=i+1;j<len;j++)
				{
					if(j%2!=0 && arr[j]%2==0) {
						
						arr[i]=arr[j];
						arr[j]=temp;
						i=j;
						break;
					}
					
				}
			}
			else i++;
		}
		System.out.println("array after changes");
		for(i=0;i<len;i++)
			System.out.println(arr[i]);
	}
}
