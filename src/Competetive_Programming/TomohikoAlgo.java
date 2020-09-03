package com.codeForces;
import java.util.Scanner;


public class TomohikoAlgo {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int day=sc.nextInt();
int month=sc.nextInt();
int year=sc.nextInt();
int res=dayOfTheWeek(day, month, year);
System.out.println(res);

	}

	public  static  int dayOfTheWeek(int d,int m,int y)
	{
	int [] t= {0,3,2,5,0,3,5,1,4,6,2,4};
	if(m<3)
		y=y-1;
	
		return ((y+y/4-y/100+y/400+t[m-1]+d)%7);
	}
}
