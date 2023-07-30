package com.cg.day2;

public class While_Loop {
	
	
	void looping(int x) {
		while(x>=0) {
			System.out.println(x);
			x--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While_Loop w=new While_Loop();
		w.looping(56);
	}

}
