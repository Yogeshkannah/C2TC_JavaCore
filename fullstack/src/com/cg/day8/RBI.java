package com.cg.day8;

public class RBI {
	void RateOfInterest() {
		System.out.println("10%");
	}
}

 class SBI extends RBI{
	void RateOfInterest() {
		System.out.println("15%");
	
	
		super.RateOfInterest();
	}
}
 
 class IndianBank extends RBI{
		void RateOfInterest() {
			System.out.println("5%");
		}
		
	}
 

