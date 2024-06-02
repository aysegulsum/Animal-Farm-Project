
public class Donkey extends Mammal{
	
	//Ayþe Gülsüm EREN 150120005

	private static int count = 0;
	
	Donkey(String name, int age){
		super(name, age);
		super.setLegNumber(4);
		super.setNumberOfOffsprings(1);
		super.setPregnancyPerYear(1);
		count++;
	}
	public void sayGreetings(){
		System.out.println("Life will go on as it has always gone –that is, badly!");
	}
	public static int getCount(){
		return count;
	}
	public static void decrementCount() {
		count--;
	}
}
