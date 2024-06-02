
public class Animal {

	// Ayþe Gülsüm EREN 150120005
		
	private String name;
	private int legNumber;
	private int age;
	private int pregnancyPerYear;
	private int numberOfOffsprings;
	
	    //create constuctor
		Animal(String name, int age){
			this.name = name;
			this.age = age;
		}
		
		//write methods
		public void sayGreetings() {
			System.out.println("Have nothing to say!");
		}

		public void reproduce() {
			System.out.println("None of your business!!");
		}
		
		public String toString() {
			return "My name is " + this.name + "!\n" +
				   "I am " + this.age + " years old!\n" +
				   "I have " + this.legNumber + " number of legs!";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getLegNumber() {
			return legNumber;
		}

		public void setLegNumber(int legNumber) {
			this.legNumber = legNumber;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getPregnancyPerYear() {
			return pregnancyPerYear;
		}

		public void setPregnancyPerYear(int pregnancyPerYear) {
			this.pregnancyPerYear = pregnancyPerYear;
		}

		public int getNumberOfOffsprings() {
			return numberOfOffsprings;
		}

		public void setNumberOfOffsprings(int numberOfOffsprings) {
			this.numberOfOffsprings = numberOfOffsprings;
		}
		
		
	}


