import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AnimalFarm {
	
	//Ayþe Gülsüm EREN 150120005

       private ArrayList<Animal> animalList = new ArrayList<>();
       private ArrayList<String> animalNames = new ArrayList<>();
       private int CAPACITY;
       private static int numberOfAnimals =0;

       //create constructor
       public AnimalFarm(int CAPACITY) {
	   this.CAPACITY= CAPACITY;
	   }
       public int getNumberOfAnimals() {
	   return numberOfAnimals;
       }

       public boolean addAnimal(Animal animal) throws IllegalNameException {
	    boolean result = false;
	
	     if(AnimalFarm.numberOfAnimals < CAPACITY ) {

		  if(AnimalFarm.numberOfAnimals == 0){
    	   // animalList.add(animal);
			//animalNames.add(animal.getName());
			result = true;
           }
		  else if(AnimalFarm.numberOfAnimals != 0 ) {
    	   
		    for(int i=0; i<AnimalFarm.numberOfAnimals ;i++) {
    			if(! animal.getName().equals(animalNames.get(i))) { 
				//animalList.add(animal);
				//animalNames.add(animal.getName());
				result = true;
	     		}
		    	else {
			    	throw new IllegalNameException();
			    }
     	    }
          }
	}
	else result = false;
	
	if(result) {
		animalList.add(animal);
		animalNames.add(animal.getName());
		AnimalFarm.numberOfAnimals++;
	}
	return result;
		
}
public boolean removeAnimal(String name) {
	boolean result= false;
	for(int i=0; i< AnimalFarm.numberOfAnimals;i++) {
	
		if(AnimalFarm.numberOfAnimals != 0 ) {
	    if(name.equals(animalNames.get(i))) {
	   
	    	if(animalList.get(i) instanceof Chicken) 
	    	   Chicken.decrementCount();
	    	
	        else if((animalList.get(i) instanceof Donkey))
	    	   Donkey.decrementCount();
	    	
	    	else if((animalList.get(i) instanceof Horse))
	    	   Horse.decrementCount();
	    	
	        else if((animalList.get(i) instanceof Pig ))
    		   Pig.decrementCount();
	    	
    	    else if((animalList.get(i) instanceof Raven))
    		   Raven.decrementCount();
	    	
    	    else if((animalList.get(i) instanceof Sheep))
     		   Sheep.decrementCount();

	    	animalList.remove(i);
	    	animalNames.remove(i);
	    	AnimalFarm.numberOfAnimals--;
	    	
	    	result = true;
	    	break;
	        }
		}
	   else 
	    	result = false;
	  
	}
		return result;
}
public void printAllAnimalGreetings() {
	for(int i=0; i< animalList.size();i++) {
		printOneAnimalGreeting(animalList.get(i));
	}
}
public void printOneAnimalGreeting(Animal animal) {
      animal.sayGreetings();
	
}
public void printAllAnimalNames() {
	for(int i=0; i< animalList.size();i++) {
		printOneAnimalName(animalList.get(i));
	}
	
}
public void printOneAnimalName(Animal animal) {
	System.out.println(animal.getName());
}
public void printAllAnimals() {
	for(int i=0; i< animalList.size();i++) {
		System.out.println(animalList.get(i).toString());
	}
}
public int nextYearPopulationForecast() {
    int forecast=animalList.size();;
	for(int i=0; i< animalList.size();i++) {
        forecast += (animalList.get(i).getNumberOfOffsprings()) * animalList.get(i).getPregnancyPerYear();
	}
	return forecast;
}
public void animalMovements() {
	for(int i=0; i< animalList.size();i++) {
		if(animalList.get(i) instanceof Bird) {
			System.out.print("My name is " + ((Bird)animalList.get(i)).getName() +" and ");
			((Bird)animalList.get(i)).fly();}
		else if (animalList.get(i) instanceof Mammal) {
			System.out.print("My name is " + ((Mammal)animalList.get(i)).getName() +" and ");
			((Mammal)animalList.get(i)).walk();
		}
    }
}
public void eatingHabits() {
	for(int i=0; i< animalList.size();i++) {
		if(animalList.get(i) instanceof Bird) {
			System.out.print("My name is " + ((Bird)animalList.get(i)).getName() +" and ");
			((Bird)animalList.get(i)).omnivore();
			}
		else if (animalList.get(i) instanceof Mammal) {
			System.out.print("My name is " + ((Mammal)animalList.get(i)).getName() +" and ");
		    ((Mammal)animalList.get(i)).herbivore();
		}
	}
}
public void sortAlphabetically() {
	ArrayList<Animal> sorted = new ArrayList<Animal>();
	
	String[] sort = new String[AnimalFarm.numberOfAnimals];
	
	if(AnimalFarm.numberOfAnimals == 1)
	System.out.println(animalList.get(0).toString());	
	
	else if(AnimalFarm.numberOfAnimals >=2) {
		for(int i=1; i<AnimalFarm.numberOfAnimals ;i++) {
			sort[i] = animalList.get(i).getName();
			//sorted.add(null);
		}
	/*for(int i=0; i<AnimalFarm.numberOfAnimals ;i++) {
		String name1 = animalList.get(i).getName();
		for(int j=i+1; j<AnimalFarm.numberOfAnimals ;j++) {
			String name2= animalList.get(j).getName();
			if(name1.compareTo(name2)>0) {//if((animalList.get(i).getName()).compareTo(animalList.get(j).getName()) > 0) {
			
				sorted.add(i, animalList.get(j));
			    sorted.add(j, animalList.get(i));
				
		    }
	    }*/
		java.util.Arrays.sort(sort);
	}
	
	for(int i=0; i< AnimalFarm.numberOfAnimals;i++) {
		System.out.println(sort[i]);//"My name is " + sorted.get(i).getName());
	}
	}	

public void sortBasedOnLegNumber() {
	//ArrayList<Animal> sorted = new ArrayList<>();
    Integer[] sort = new Integer[AnimalFarm.numberOfAnimals];
	if(AnimalFarm.numberOfAnimals == 1)
	System.out.println(animalList.get(0).toString());	
	
	else if(AnimalFarm.numberOfAnimals >=2) {
		for(int i=1; i<AnimalFarm.numberOfAnimals ;i++) {
			sort[i] = animalList.get(i).getLegNumber();
			//sorted.add(animalList.get(i));
		}
	java.util.Arrays.sort(sort);	
		/*
	for(int i=0; i<AnimalFarm.numberOfAnimals ;i++) {
		for(int j=i+1; j<AnimalFarm.numberOfAnimals ;j++) {   
			if(animalList.get(j).getLegNumber()< animalList.get(i).getLegNumber()) {
			sorted.add(i, animalList.get(j));
			sorted.add(j, animalList.get(i));}
	    }
	}*/
	
	for(int i=0; i< AnimalFarm.numberOfAnimals;i++) {
	//	System.out.println("My name is " + sorted.get(i).getName() + " I have " + sorted.get(i).getLegNumber() + " legs.");
	System.out.println(sort[i]);
	}
	}
}
public void sortBasedOnAge() {
	ArrayList<Animal> sorted = new ArrayList<>();
	
	if(AnimalFarm.numberOfAnimals == 1)
	System.out.println(animalList.get(0).toString());	
	
	else {//if(AnimalFarm.numberOfAnimals >=2) {
		for(int i=1; i<AnimalFarm.numberOfAnimals ;i++) {
			sorted.add(animalList.get(0));
		}
	for(int i=0; i<AnimalFarm.numberOfAnimals ;i++) {
		for(int j=i+1; j<AnimalFarm.numberOfAnimals ;j++) {   
			if(animalList.get(j).getAge()< animalList.get(i).getAge()) {
			sorted.add(i, animalList.get(j));
			sorted.add(j, animalList.get(i));
		    }
	    }
	}
	
	for(int i=0; i< AnimalFarm.numberOfAnimals;i++) {
		System.out.println("My name is " + sorted.get(i).getName() + " I am " + sorted.get(i).getAge() + " years old.");
	
	}
	}
	
}
public void searchBasedOnName(String name) {
	for(int i=0; i< animalList.size();i++) {
		if(name.equals(animalList.get(i).getName())) {
			System.out.print(animalList.get(i).toString());
		}
	}
}
public void searchBasedOnAge(int age) {
	for(int i=0; i< animalList.size();i++) {
		if(age != animalList.get(i).getAge()) 
		continue;
		else
		System.out.println(animalList.get(i).toString());
		}
}
public void printReport(String filename) throws FileNotFoundException {

    java.io.File file = new java.io.File(filename);
      // Create a file
      PrintWriter output = new PrintWriter(file);
     
      // Write output to the file
      output.println("We have a total of " + this.getNumberOfAnimals() + " animals in the farm.");
      
      
      output.println("   " + Chicken.getCount() + " of them are Chicken. Those are: ");
      output.printf("%12s %12s %18s ","Name", "Age", "Leg Number\n");
      for(int i=0; i< AnimalFarm.numberOfAnimals;i++) {
    	  if(animalList.get(i) instanceof Chicken) {
    		  output.printf("%12s %10s %14s\n", animalList.get(i).getName(), animalList.get(i).getAge(), animalList.get(i).getLegNumber());
    	  }
      }
      output.println("   " + Donkey.getCount() + " of them are Donkey. Those are: ");
      output.printf("%12s %12s %18s ","Name", "Age", "Leg Number\n");
      for(int i=0; i< AnimalFarm.numberOfAnimals;i++) {
    	  if(animalList.get(i) instanceof Donkey) {
    		  output.printf("%12s %10s %14s\n ", animalList.get(i).getName(), animalList.get(i).getAge(), animalList.get(i).getLegNumber());
    	  }
      }
      output.println("   " + Horse.getCount() + " of them are Horse. Those are: ");
      output.printf("%12s %12s %18s ","Name", "Age", "Leg Number\n");
      for(int i=0; i< AnimalFarm.numberOfAnimals;i++) {
    	  if(animalList.get(i) instanceof Horse) {
    		  output.printf("%12s %10s %14s\n ", animalList.get(i).getName(), animalList.get(i).getAge(), animalList.get(i).getLegNumber());
    	  }
      }
      output.println("   " + Pig.getCount() + " of them are Pig. Those are: ");
      output.printf("%12s %12s %18s ","Name", "Age", "Leg Number\n");
      for(int i=0; i< AnimalFarm.numberOfAnimals;i++) {
    	  if(animalList.get(i) instanceof Pig) {
    		  output.printf("%12s %10s %14s\n ", animalList.get(i).getName(), animalList.get(i).getAge(), animalList.get(i).getLegNumber());
    	  }
      }
      output.println("   " + Raven.getCount() + " of them are Raven. Those are: ");
      output.printf("%12s %12s %18s ","Name", "Age", "Leg Number\n");
      for(int i=0; i< AnimalFarm.numberOfAnimals;i++) {
    	  if(animalList.get(i) instanceof Raven) {
    		  output.printf("%12s %10s %14s\n ", animalList.get(i).getName(), animalList.get(i).getAge(), animalList.get(i).getLegNumber());
    	  }
      }
      output.println("   " + Sheep.getCount() + " of them are Sheep. Those are: ");
      output.printf("%12s %12s %18s ","Name", "Age", "Leg Number\n");
      for(int i=0; i< AnimalFarm.numberOfAnimals;i++) {
    	  if(animalList.get(i) instanceof Sheep) {
    		  output.printf("%12s %10s %14s\n ", animalList.get(i).getName(), animalList.get(i).getAge(), animalList.get(i).getLegNumber());
    	  }
      }
    
      output.close();
}
}
