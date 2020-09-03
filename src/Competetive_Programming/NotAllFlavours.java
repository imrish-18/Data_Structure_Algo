package codeChef;
import java.util.HashSet;
import java.util.Scanner;
public class NotAllFlavours {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		
		int max=0;
		
		
//		for(int i=0;i<n-1;i++)
//		{
//			set.clear();
//			count=0;
//			set.add(arr[i]);
//	        count++;
//			for(int j=i+1;j<n;j++)
//			{
//				set.add(arr[j]);
//				if(set.size()!=k) {
//				count++;
//				if(max<count)
//					max=count;
//				}
//			 if(set.size()==k)
//				{
//					if(max<count) {
//					
//						max=count;
//						
//					}
//				
//					break;
//				}
//		          
//				
//			}
//			if(max>n)
//			break;
//		}
//		if(max==0)
//			System.out.println(n);
//		else
//		System.out.println(max);
		


int curr = 0;

for(int i=1; i <= k; i++)
    {
	curr = 0;
	for(int j=0; j < n; j++)
        {
		if(arr[j] == i)
      {
			if(curr > max) max = curr;
			
			curr = 0;
		}
         else{
			curr++;
		}
	}
	if(curr > max){
		max = curr;
	}
	if(max == n){
		break;
	}
}
System.out.println(max);
}
	}
}