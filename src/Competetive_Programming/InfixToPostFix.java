package codeChef;
import java.util.*;

public class InfixToPostFix 
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while( t-- > 0)
		{
			int n=sc.nextInt();
			Stack<Character> st=new Stack<Character>();
			String string=sc.next();
			char c;
			char ch[]=string.toCharArray();
			String str="";
			for(int i=0;i<string.length();i++) 
			{
				
				if(ch[i]=='(')
				{
					st.push(ch[i]);
					
				}
				
				else if((ch[i]=='+' || ch[i]=='-' || ch[i]=='*' || ch[i]=='/' || ch[i]=='^'))
				{
					if(st.isEmpty())
					{
						st.push(ch[i]);
					}
					else {
					c=st.peek();
					while(precedence(c)>=precedence(ch[i]))
					{
						st.pop();
						str=str+c;
						if(!st.isEmpty())
						c=st.peek();
						else break;
		
					}
					st.push(ch[i]);
					
					
					}
					
				}
				else if((ch[i]>=97 && ch[i]<=122) || (ch[i]>=65 && ch[i]<=91))
				{
					
					str=str+ch[i];
					
					
				}
				
				else if(ch[i] == ')' && !st.isEmpty())        
				{
					c = st.pop();                  
					while(c != '(')                
					{
						
						str=str+c;
						c = st.pop();
					}
					
				}
//				else if(st.isEmpty()) {
//					st.push(ch[i]);
//				}
				else
				{
					System.out.println("invalid expression");
					break;
				}
			}
			while(!st.isEmpty())
				str=str+st.pop();
			
			
			System.out.println(str);
			
		}
		
		sc.close();

	}
	static int precedence(char symbol)
	{
		if(symbol == '^')
		{
			return(3);
		}
		else if(symbol == '*' || symbol == '/')
		{
			return(2);
		}
		else if(symbol == '+' || symbol == '-')          
		{
			return(1);
		}
		else
		{
			return(0);
		}
	}
	
}