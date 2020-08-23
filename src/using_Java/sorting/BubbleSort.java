package sorting;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array..");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("enter the element into array");
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		bubble_sort(arr);
		sc.close();
	}
	
	
	static void bubble_sort(int arr[]) 
	{
		int temp;
		int flag=0,count=0;;
	   for(int i=0;i<arr.length-1;i++)
	   {
		   flag=0;
		   for(int j=0;j<arr.length-1-i;j++)
		   {
			   if(arr[j]>arr[j+1])
			   {
				   temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
				   flag=1;
				   count++;
			   }
		   }
		   if(flag==0)
			   break;
	   }
	   for(int i=0;i<arr.length;i++)
		   System.out.println(arr[i]);
	   System.out.println(count);
	}

}
///  time complexity  max o(n*n) min o(n) 