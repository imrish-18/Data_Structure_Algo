package com.codeForces;
import java.util.*;

public class AterNatingChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		int []arr=new int[str.length()];
		
	for(int i=0;i<str.length()-1;i++)
	{
		if(str.charAt(i)!=str.charAt(i+1))
		{
			arr[i+1]=1;
		}
		
	}
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]==1 &&
			
			{
			count++;
			i++;
			}
	}
	System.out.println(count);
	}

}
