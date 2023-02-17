public class CheckingAccount2{
	private String name;
	private int balance;
	
	public CheckingAccount2(String inputName, int inputBalance) {
		name = inputName;
		balance = inputBalance;
	}
	
	private void addFunds(int fundsToAdd) {
		balance += fundsToAdd;
		
	}
	
	private void getInfo() {
		System.out.println("This checking account belongs to " + name +". It has " 
				+ balance + " dollars in it.");
	}
	
	public static void main(String[] args) {
		CheckingAccount2 myAccount =  new CheckingAccount2("Lias", 2000);
		System.out.println(myAccount.balance);
		myAccount.addFunds(5);
		System.out.println(myAccount.balance);
	}
}