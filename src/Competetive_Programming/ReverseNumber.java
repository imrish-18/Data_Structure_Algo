package codeChef;

public class ReverseNumber {

	public static void main(String[] args) {
		
int x=1534236469;
		 if(x<-2147483648 )
	           System.out.println("hello");
	        else if(x>2147483647)
	             System.out.println("how are you");
	        else
	        {
	            int rem=0,sum=0;
	            int n=x;
	            while(x!=0)
	            {
	                rem=x%10;
	                sum=sum*10+rem;
	                x=x/10;
	            }
	            if(n>0)
	              System.out.println("commando aklf");
	            else
	             System.out.println("commando");

	}
		 }
	

}
