package sorting;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the length of the arrray");
	     int len=sc.nextInt();
	     int arr[]=new int[len];
	     System.out.println("please enter the element into array");
	     for(int i=0;i<len;i++)
	    	 arr[i]=sc.nextInt();
	     insertionSort(arr);
		sc.close();

	}
     public static void insertionSort(int arr[])
     {
    	 int j,temp;
    	 for(int i=1;i<arr.length;i++)
    	 {
    		 j=i-1;
    		 temp=arr[i];
    		 while(j>=0 && temp<arr[j])
    		 {
    			 arr[j+1]=arr[j];
    			 j--;
    			 
    		 }
    		 
    		 arr[j+1]=temp; 
    	 }
    	 
    	 for(int i=0;i<arr.length;i++)
    		 System.out.println(arr[i]);
     }
}


// max complexity o(n*n) min complexity o(n)
// max comparison o(n*n) min o(n)
//  it is adaptive and stable

