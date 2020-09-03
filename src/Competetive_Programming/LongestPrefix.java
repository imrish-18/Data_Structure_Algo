package codeChef;
import java.util.Scanner;
import java.util.Stack;

public class LongestPrefix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
	Stack<Character> st=new Stack<>();

	int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='>' && st.size()==0)
			{
				break;
			}
			else if(ch[i]=='<')
			{
				st.push(ch[i]);
			}
			else
			{
				st.pop();
				if(st.size()==0)
					count=i+1;
			}
		}
		
		
System.out.println(count);
	}

}
