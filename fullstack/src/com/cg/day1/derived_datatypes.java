package com.cg.day1;

public class derived_datatypes {
	int arr[]= {1,2,3,4,5,6};
	double x=1.2;
	float y=10.0f;
	long v=975174673;
	
	
	void print() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived_datatypes c=new derived_datatypes();
		c.print();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.v);

	}

}
