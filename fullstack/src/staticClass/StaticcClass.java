package staticClass;

public class StaticcClass {
	static int x=34;
	
	StaticcClass(){
		x=12;
		System.out.println(x);
	}
	static void print() {
		System.out.println("printing....");
	}
	
	static {
		System.out.println("this is statci block...");
	}
	
	static int changeVariable() {
		x=10;
		return x;
	}
	
	
}
