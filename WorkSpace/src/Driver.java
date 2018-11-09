
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cow cow = new Cow();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal cat2 = new Cat();
		Tree tree = new Tree();
		
		
		Animal[] animals = {cow, dog, cat};
		for ( int i = 0; i<animals.length ; i++)
		{
			animals[i].speak();
		}
		
		Alive [] things = {cow, dog,cat ,cat2, tree};
		
		for ( int i = 0; i<things.length ; i++)
		{
			things[i].eat();
		}
		

	}

}
