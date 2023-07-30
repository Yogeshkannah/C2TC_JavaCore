package com.cg.day2;

public class operators {
	int add(int x,int y) {
		return x+y;
	}
	
	int sub(int x,int y) {
		return x-y;
	}
	
	int mul(int x,int y) {
		return x*y;
	}
	
	int div(int x,int y) {
		return x/y;
	}
	
	int mod(int x,int y) {
		return x%y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operators op=new operators();
		System.out.println(op.add(23, 56));
		System.out.println(op.sub(23, 56));
		System.out.println(op.mul(23, 56));
		System.out.println(op.div(23, 56));
		System.out.println(op.mod(23, 56));
		
		}

}
