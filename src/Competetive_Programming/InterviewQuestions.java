package com.codeForces;

/*class A {
	final int a = 10;

	final void disp() {
		System.out.println(a);
	}
}

class B extends A {
	
	 * Cannot override the final method from A public void disp() {
	 * System.out.println("hello"); }
	 */
//}

public class InterviewQuestions {

	public static void main(String args[]) {
		/* A a = new A(); */
		System.out.println("hello");
		try {
			int value = 10 / 0;
			return;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		/*
		 * Unreachable catch block for ArithmeticException. It is already handled by the
		 * catch block for Exception
		 * 
		 * catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		 */
		finally {
			System.out.println("hello rish");
		}
		/*
		 * The final field A.a cannot be assigned a.a=19;
		 */

	}
}
/*
 * it will override parent class method class C extends InterviewQuestions {
 * public static void main(String args[]) {
 * System.out.println("hello rishabh sharma"); } }
 */
