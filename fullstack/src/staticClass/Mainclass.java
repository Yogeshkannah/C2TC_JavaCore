package staticClass;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticcClass.x);
		StaticcClass c=new StaticcClass();
		System.out.println(c.x);
		System.out.println("After changing the static variable....");
		System.out.println(StaticcClass.changeVariable());
		
	}

}
