package com.codeForces;

public class SubstringShare {

	public static void main(String[] args) {
		String s1="hi";
		String s2="world";
		int count=0;
		String len= s1.length()>s2.length()?s1:s2;
		String len1= s1.length()>s2.length()?s2:s1;
		
		for(int i=0;i<len.length()/2;i++)
		{
			if(len1.contains(len.substring(i,i+1)) ||
					len1.contains(len.substring(len.length()-1-i,len.length()-i)))
			{
				count++;
				break;
			}
		}
		if(count!=0)
		System.out.println("YES");
		else 
			System.out.println("NO");

	}
	

}
