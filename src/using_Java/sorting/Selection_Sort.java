package sorting;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the length of the arrray");
	     int len=sc.nextInt();	
	     int arr[]=new int[len];
	     System.out.println("please enter the element into array");
	     for(int i=0;i<len;i++)
	    	 arr[i]=sc.nextInt();
	     selection_Sort(arr);
		sc.close();
	}
      public static void selection_Sort(int arr[])
      {
    	  int temp;
    	  for(int i=0;i<arr.length-1;i++)
    	  {
    		  int k;
    		  for(int j=k=i;j<arr.length;j++)
    		  {
    			  if(arr[j]<arr[k])
    				  k=j;
    		  }
    		  temp=arr[i];
    		  arr[i]=arr[k];
    		  arr[k]=temp;
    	  }
    	  for(int i=0;i<arr.length;i++)
    		  System.out.println(arr[i]);
      }

}

//not adaptive
// not stable
// time complexity o(n*n)