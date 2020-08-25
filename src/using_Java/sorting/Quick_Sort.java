package sorting;

import java.util.Scanner;

public class Quick_Sort
{
    public static void main(String args[])
    {
    	
    	Scanner sc=new Scanner(System.in);
		System.out.println("please enter the length of the arrray");
	     int len=sc.nextInt();	
	     int arr[]=new int[len];
	     System.out.println("please enter the element into array");
	     for(int i=0;i<len;i++)
	    	 arr[i]=sc.nextInt();
	     quick_Sort(arr,0,arr.length+1);
		sc.close();
    }
    
    public static void quick_Sort(int arr[],int low,int high)
    {
    	int j;
    	if(low<high)
    	{
    		j=partition(arr,low,high-1);
    		quick_Sort(arr, low,j);
            quick_Sort(arr,j+1, high);
    	}
    	
    	for(int i=0;i<arr.length;i++)
    		System.out.println(arr[i]);
    }
    public static int partition(int a[],int low,int high)
    {
    	
    int temp;
    	 int pivot=a[low];
    	 int i=low,j=high;

    	 do
    	 {
    	 do{i++;}while(i<high && a[i]<=pivot);
    	 do{j--;}while(j>=0 && a[j]>pivot);

    	 if(i<j)
    	 {
    		 
    		 temp=a[i];
    	    	a[i]=a[j];
    	    	a[j]=temp;
    	    	}
    	 }while(i<j);
    	temp=a[low];
    	a[low]=a[j];
    	a[j]=temp;
    	return j;
    	 }
	
}
