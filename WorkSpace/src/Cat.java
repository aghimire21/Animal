
public class Cat extends Animal{

	@Override
	public void speak() {
		super.speak();
		System.out.println( getClass().getName() + " goes Meow.");
		
		

	}

	

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("woof");
		
	}

	@Override
	public void getheight() {
		// TODO Auto-generated method stub
		
	}

}
