package Interface;

public class Concrete_class implements Bank {
	float currBalance=1000.f;
	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		if(amount>=MaxLimit) {
			System.out.println("limit exceeded");
		}
		else {
			
			currBalance+=amount;
			System.out.println("your current balance :"+currBalance);
		}
		
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if (amount>=currBalance-minBalance) {
			System.out.println("No sufficient Balance is available in your account...");
		}
		else {
			currBalance-=amount;
		}
		
		
	}

	
	public String Balance() {
		return "Balance [currBalance=" + currBalance + "]";
	}
	
	
	
}
