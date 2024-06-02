
public class Mammal extends Animal{

	//Ayþe Gülsüm EREN 150120005
	
	Mammal(String name, int age){
		super(name, age);
	}
	public void walk() {
		System.out.println("I can walk to the far away lands!");
	}
	
	public void reproduce() {
		System.out.println("I give birth!");
	}
	public void herbivore() {
		System.out.println("I eat plants only!");
	}
	
}
