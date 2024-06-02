
public class Pig extends Mammal {
	
	//Ayþe Gülsüm EREN 150120005

 private static int count = 0;
	
	Pig(String name, int age){
		super(name, age);
		super.setLegNumber(4);
		super.setNumberOfOffsprings(12);
		super.setPregnancyPerYear(2);
		count++;
	}
	public void sayGreetings(){
		System.out.println("All animals are equal, but some animals are more equal than others!");
	}
    public static int getCount(){
		return count;
	}
	public static void decrementCount() {
	    count--;
	}			
}
