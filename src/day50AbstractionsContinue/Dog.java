package day50AbstractionsContinue;

public class Dog extends Animal{
	
	
	public Dog(char Gender, byte Age, String color, String NickName) {
		super(Gender, Age, color, NickName);
	}
	
	@Override
	public void Speak(String language) {
		System.out.println(Nickname + " is speaking "+language);
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname + " is eating "+food);
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname + " sleeps "+ hour);
		
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(Nickname + " drinks "+ drinks);
		
		
		
	}
	
	
// Dog obj = new Dod('F',5,"Red",Age);
}
