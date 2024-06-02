
public class Raven extends Bird{
	
	//Ayþe Gülsüm EREN 150120005

private static int count = 0;
	
	Raven(String name, int age){
		super(name, age);
		super.setLegNumber(2);
		super.setNumberOfOffsprings(5);
		super.setPregnancyPerYear(1);
		count++;
	}
	public void sayGreetings(){
		System.out.println("A happy country where we poor animals shall rest forever!");
	}
    public static int getCount(){
		return count;
	}
	public static void decrementCount() {
	    count--;
	}			
}
