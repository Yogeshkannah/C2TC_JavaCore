package nested_class;

public class main_class {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		class1 s=new class1();
		class1.class2 n=s.new class2();
		s.run();
		n.run();
	}

}
