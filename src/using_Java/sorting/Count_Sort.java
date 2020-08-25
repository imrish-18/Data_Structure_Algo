package sorting;

import java.util.Scanner;

public class Count_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter the length of the array");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("please enter the element into array");
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		count_Sort(arr);
        sc.close();
	}
	
	public static void count_Sort(int arr[])
	{
		
		int max=find_Max(arr);
		int count[]=new int[max+1];
		for(int i=0;i<arr.length;i++)
			count[arr[i]]=+1;
		int i=0,j=0;
		while(i<max+1) {
			if(count[i]>0) {
				arr[j++]=i;
				count[i]--;
			}
			else
				i++;
		}
		for( i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static int find_Max(int arr[])
	{
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
			
	return max;	
	}
}

