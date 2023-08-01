package Interface;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete_class c=new Concrete_class();
		c.deposit(2500);
		System.out.println(c.Balance());
		c.withdraw(12000);
	}

}
