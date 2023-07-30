package com.cg.day2;

public class breakAndContinue {
	
	void continue_looping(int x) {
		System.out.println("continue Statement");
		for(int i=0;i<=x;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	void break_looping(int x) {
		System.out.println("Break Statement");
		for(int i=0;i<=x;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		breakAndContinue b=new breakAndContinue();
		b.continue_looping(50);
		b.break_looping(10);
	}

}
