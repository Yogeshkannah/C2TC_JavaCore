package com.cg.day2;

public class Switch {
	void check(int x) {
		switch(x) {
		case 1:
			System.out.println("Case:1");
			break;
		
		case 2:
			System.out.println("Case:2");
			break;
		
		case 3:
			System.out.println("Case:3");
			break;
		
		case 4:
			System.out.println("Case:4");
			break;
		
		default:
			System.out.println("Default case");
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch s=new Switch();
		s.check(45);

	}

}
