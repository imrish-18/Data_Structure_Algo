package LinkedList;

import java.util.Stack;
import java.util.*;

public class Find2BigElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter the size of the stack");
	     int n=sc.nextInt();
	     Stack<Integer> stack=new Stack<>();
	    for(int i=0;i<n;i++)
	    {
	    	a=sc.nextInt();	    	
	    	stack_Operation(a, stack);
	    }

	}
	public static void stack_Operation(int number,Stack<Integer> stack)
	{
		
		int c=0;
		if(stack.empty())
		{
			stack.push(number);
			System.out.println("successfulll entered");
		}
		else
		{
			c=stack.peek();	
			if(c<number)
			{
			  while(!stack.isEmpty())
			  {
				  System.out.println("number is ..."+number);
				  stack.pop();
			  }
			  stack.push(number);
			  
			}
			else
			{
				
				stack.push(number);
			}
			
		}
		
	}

}
