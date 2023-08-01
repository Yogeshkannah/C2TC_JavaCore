package Interface;

public interface Bank {
	int minBalance=1000;
	float MaxLimit=25000.f;
	void deposit(int amount);
	void withdraw(int amount);
}


