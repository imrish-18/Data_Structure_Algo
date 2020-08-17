package CodingQuestions;
import java.util.*;
public class AnagramString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int flag=1;
		int arr[]=new int[26];

		System.out.println("enter the strings");
		String str=sc.next();
		String string=sc.next();
		char ch[]=str.toCharArray();
		char ch1[]=string.toCharArray();
		if(str.length()!=string.length())
			System.out.println("strings are not anagram");
		else
		{

			for(int i=0;i<str.length();i++)
			{
				arr[ch[i]-97]=arr[ch[i]-97]+1;

			}
			
			for(int i=0;i<str.length();i++)
			{
				arr[ch1[i]-97]=arr[ch1[i]-97]-1;
				if(arr[ch1[i]-97]==-1)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println("strings are anagrams");
			else
				System.out.println("strings are not anagrams");
			sc.close();
			
		}
	
		
	

	}

}
