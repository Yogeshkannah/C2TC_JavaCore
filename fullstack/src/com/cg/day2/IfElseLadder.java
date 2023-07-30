package com.cg.day2;

public class IfElseLadder {
	void check(int n) {
		if(n>=90 && n<=100) {
			System.out.println("Grade "+n+": A");
		}
		else if(n>=80 && n<90) {
			System.out.println("Grade "+n+": B");
		}
		else if(n>=70 && n<80) {
			System.out.println("Grade "+n+": C");
		}
		else if(n>=50 && n<70) {
			System.out.println("Grade "+n+": D");
		}
		else {
			System.out.println("Grade "+n+": You got fail marks");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElseLadder i=new IfElseLadder();
		i.check(6);

	}

}
