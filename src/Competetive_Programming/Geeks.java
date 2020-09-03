package sorting;

import java.util.*;
class Geeks
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int count=0;
int t=sc.nextInt();

for(int i=0;i<t;i++)
{
int m=sc.nextInt();
int n=sc.nextInt();
int cost=0;


              while(m!=n)
              { 
            	  count++;
            	  int d=0;
              for(int j=m/2;j>0;j--)
              {
            	  count++;
              if(j%2==0 && m%j==0 && m+j<=n )
              {
              d=j;
              break;
              }
              }
             
              if(d==0)
              {
              cost=-1;
              break;
              }
              cost=cost+(m/d);
              m=m+d;
             
              }
             
   System.out.println(cost);
   System.out.println(count);

             
}


}
}
