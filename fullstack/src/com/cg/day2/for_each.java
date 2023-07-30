package com.cg.day2;

public class for_each {
	
	void looping(int[] arr) {
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for_each n=new for_each();
		int arr[]= {1,2,3,4,5,67,8,8};
		n.looping(arr);
	}

}
