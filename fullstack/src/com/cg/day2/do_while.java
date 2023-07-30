package com.cg.day2;
import java.util.*;

public class do_while {
	
	void looping() {
		int x;
		do {
			Scanner sc=new Scanner(System.in);
			x=sc.nextInt();
			System.out.println(x);
		}while(x>0);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
		do_while obj=new do_while();
		obj.looping();
	}

}
