package com.cg.day2;

public class nested_for {
	
	void looping(int x) {
		for(int i=0;i<=x;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nested_for f=new nested_for();
		f.looping(10);

	}

}
