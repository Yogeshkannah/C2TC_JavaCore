package heiraricalInheritance;

public class cat extends Animal{
	void meow() {
		System.out.println("meowing...");
	}
	public static void main(String[] args) {
		cat c =new cat();
		c.eat();
		c.meow();
//		c.bark();             it will not work here..
	}
}
