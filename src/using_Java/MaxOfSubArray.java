import java.util.*;
public class MaxOfSubArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the length of the array");
		int len=sc.nextInt();
      int arr[]=new int[len];	
      for(int i=0;i<arr.length;i++)
    	  arr[i]=sc.nextInt();
      int max=maxSum(arr);
      System.out.println(max);
	}
	
	public static int maxSubArraySum(int[] arr) {
		int size=0;
				int start = 0;
				int end = 0;
		int max = 0, curr = 0;
		for (int i = 0; i < size; i++) {
		if (arr[i] > curr + arr[i]) {
		start = i;
		max = arr[i];
		} else
	max = curr + arr[i];
		
		if (max < curr) {
		max = curr;
	end = i;
		}
	}
		  System.out.println("max sum found btw" +start+" "+end);
		return max;
		}
	
    public static int maxSum(int arr[]) {
    	int max=arr[0];
    	int cur=arr[0];
    	for(int i=1;i<arr.length;i++)
    	{
    		cur=Math.max(arr[i], cur+arr[i]);
    		max=Math.max(max, cur);
    		
    	} 
    	return max;
    }

}
