public class Dog1{
	public String name;
	public int age;
	
	public Dog1(String input_name, int input_age) {
		name = input_name;
		age = input_age;
	}
	
	public void speak() {
		System.out.println("Arf Arf! My name is " + name + " and I am a good dog!");
	}
}