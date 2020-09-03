package codeChef;
import java.util.*;
public class ChefsQueue {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int mod = 1000000007;
	        int n = sc.nextInt();
	        sc.nextInt();
	        
	        long answer = 1;
	        Stack<Integer> st = new Stack<Integer>();
	        Stack<Integer> id = new Stack<Integer>();
	        for(int i = 0; i < n; i++) {
	            int cur = sc.nextInt();
	            while(!st.isEmpty() && st.peek() > cur) {
	                answer = (answer * (i - id.pop() + 1))%mod;
	                st.pop();
	            }
	            st.push(cur);
	            id.push(i);
	        }
	        
	        System.out.println(answer);
	        sc.close();
	}

}
