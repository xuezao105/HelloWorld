public class Bank2{
	private CheckingAccount2 accountOne;
	private CheckingAccount2 accountTwo;
	
	public Bank2() {
		accountOne = new CheckingAccount2("Zeus", 100);
		accountTwo = new CheckingAccount2("Hades", 200);
	}
	
	public static void main(String[] args) {
		Bank2 bankOfGods = new Bank2();
		System.out.println(bankOfGods.accountOne.name);
		bankOfGods.accountOne.addFunds(5);
		bankOfGods.accountOne.getInfo();
	}
}