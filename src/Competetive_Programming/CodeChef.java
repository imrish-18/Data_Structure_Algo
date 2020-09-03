
/* package codechef; // don't place package name! */

import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int maxProfit = 0;
			while (N-- > 0) {
				int shops = sc.nextInt();
				int people = sc.nextInt();
				int price = sc.nextInt();
				if(maxProfit< price*((people/(shops+1)))){
				    maxProfit = price*(people/(shops+1));
				}
			}
			System.out.println(maxProfit);
		}
		sc.close();
	}

}