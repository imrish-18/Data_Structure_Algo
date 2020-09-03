package com.codeForces;

public class ArrayCompare {

	public static void main(String[] args) {
		
		 String[] arr= {
				 "april","april", "april","april", "april"
				 ,"april", "april","april","june","july", "april","april", "april","april"
		 };
		int j=0;
		 for(int i=0;i<arr.length-1;i=j)
		 {
			for( j=i+1;j<arr.length;j++) {
			 if(arr[i].equals(arr[j]))
					 arr[j]="1";
			 else
				 {
			System.out.println(j);
				 break;
				 }
		 }
		 }
		 for(int k=0;k<arr.length;k++)
			 System.out.println(arr[k]);
	}

}
