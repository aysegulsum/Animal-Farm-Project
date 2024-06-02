
public class Sheep extends Mammal{

private static int count = 0;
	
	Sheep(String name, int age){
		super(name, age);
		super.setLegNumber(4);
		super.setNumberOfOffsprings(1);
		super.setPregnancyPerYear(1);
		count++;
	}
	public void sayGreetings(){
		System.out.println("Four legs good, two legs better!");
	}
    public static int getCount(){
		return count;
	}
	public static void decrementCount() {
	    count--;
	}			
}
