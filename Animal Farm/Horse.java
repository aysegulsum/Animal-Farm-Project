
public class Horse extends Mammal{
	
	//Ayþe Gülsüm EREN 150120005

	private static int count = 0;
	
	//create constructor
	Horse(String name, int age){
		super(name, age);
		super.setLegNumber(4);
		super.setNumberOfOffsprings(1);
		super.setPregnancyPerYear(1);
		count++;
	}
	//write methods
	public void sayGreetings(){
		System.out.println("I will work harder!");
	}
    public static int getCount(){
		return count;
	}
	public static void decrementCount() {
	    count--;
	}			
}
