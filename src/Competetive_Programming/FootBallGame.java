package codeChef;
import java.util.*;
public class FootBallGame {

	public static void main(String[] args) {
		
			
			       Scanner sc=new Scanner(System.in);
			       int t=sc.nextInt();
			       while(t-- > 0)
			       {
			           int a=0;
			           int b=0;
			         
			           int res=-1;
			           int n=sc.nextInt();
			             int x=n;
			           int l=n;
			           String str=sc.next();
			           char [] ch=str.toCharArray();
			           for(int i=0;i<ch.length;i++)
			           {
			               if(i%2==0)
			               {
			                   if(ch[i]=='1')
			               {
			                   a++;
			               }
			               l--;
			           }
			           else{
			               if(ch[i]=='1')
			               {
			                   b++;
			               }
			               x--;
			           }
			           if(a>b+x || b>a+l)
			           {
			               res=i+1;
			               break;
			           }
			           
			           }
			           
			           if(res==-1)
			           {
			               System.out.println(2*n);
			           }
			           else{
			               System.out.println(res);
			           }
			           
			       }
			
			}
	

}
