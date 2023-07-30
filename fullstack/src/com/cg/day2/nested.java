package com.cg.day2;
import java.util.*;
public class nested {
	
	void check(int n) {
		if(n>18) {
			if(n<60) {
				System.out.println("congratulations you're Eligibile for work..");
			}
			else {
				System.out.println("you're not Eligible for work here..");
			}
		}
		else {
			System.out.println("you're not eligible for the first criteria");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nested n=new nested();
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		n.check(x);
		sc.close();

	}

}
