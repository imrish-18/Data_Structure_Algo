package sorting;
import java.util.*;
public class Merge_Sort {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("please enter the length of the array");
	int len=sc.nextInt();
	int arr[]=new int[len];
	System.out.println("please enter the element into array");
	for(int i=0;i<len;i++)
		arr[i]=sc.nextInt();
	//merge_Sort(arr, arr.length);
	recursive_Merge_Sort(arr, 0, arr.length-1);
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	sc.close();
	

	}

	public static void merge_Sort(int arr[],int n)
	{
		int p,i,l,mid,h;
		for(p=2;p<=n;p=p*2)
		{
			for(i=0;i+p-1<n;i=i+p)
			{
				l=i;
				h=i+p-1;
				mid=(l+h)/2;
				merge(arr,l,mid,h);
				
			}
		}
		if(p/2<n)
			merge(arr,0,p/2-1,n-1);
	
		for(i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}
	
	
	// recursive merge sort
	
	 public static void recursive_Merge_Sort(int arr[],int l,int h)
	 {
		 int mid;
		 if(l<h)
		 {
			 mid=(l+h)/2;
			 recursive_Merge_Sort(arr, l, mid);
			 recursive_Merge_Sort(arr, mid+1, h);
			 merge(arr, l, mid, h);
		 }
		
	 }
	public static void merge(int arr[],int low,int mid,int high)
	{
		int i=low,j=mid+1,k=low;
		int brr[]=new int [arr.length];
		while(i<=mid && j<=high) {
			if(arr[i]<arr[j])
			{
				brr[k++]=arr[i++];
			}
			else
			{
				brr[k++]=arr[j++];
			}
		}
			for(;i<=mid;i++)
				brr[k++]=arr[i];
			for(;j<=high;j++)
				brr[k++]=arr[j];
			for(i=low;i<=high;i++)
				 arr[i]=brr[i];
		
		}
	
}
