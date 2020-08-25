package sorting;
import java.util.*;

public class Merge2Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the length of the arrays");
      int len=sc.nextInt();
      int len1=sc.nextInt();
      int arr[]=new int [len];
      int brr[]=new int[len1];
      int crr[]=new int [len+len1];
      System.out.println("please enter the elements into arrays");
      for(int i=0;i<len;i++)
    	  arr[i]=sc.nextInt();
      System.out.println("please enter the elements into arrays");
      for(int i=0;i<len1;i++)
    	  brr[i]=sc.nextInt();
      int i=0,j=0,k=0;
      while(i<len && j<len1)
      {
    	  if(arr[i]<brr[j])
    	  {
    		  crr[k++]=arr[i];
    		  i++;
    	  }
    	  else
    	  {
    		  crr[k++]=brr[j];
    		  j++;
    	  }
      }
      if(i!=len)
      {
    	  while(i<len)
    		  crr[k++]=arr[i++];
      }
      if(j!=len1)
    	  while(j<len1)
    		  crr[k++]=brr[j++];
      for( i=0;i<len+len1;i++)
    	  System.out.println(crr[i]);
		sc.close();

	}

}
