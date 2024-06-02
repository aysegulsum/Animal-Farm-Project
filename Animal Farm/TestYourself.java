
public class TestYourself {

	public static void main(String[] args) throws IllegalNameException {
		
		//Animal animal =new Animal("salep", 10);
		/*System.out.println(animal.getAge());
		System.out.println( animal.toString());
				System.out.println(animal.getName());
					//	System.out.println( animal.reproduce());
							//	
		animal.sayGreetings();
		animal.reproduce();
		
		
		animal.setLegNumber(4);
		animal.setNumberOfOffsprings(3);
		animal.setPregnancyPerYear(4);
		
		System.out.println(animal.toString());
		System.out.println( animal.getLegNumber());
		System.out.println( animal.getPregnancyPerYear());
		System.out.println( animal.getNumberOfOffsprings());*/
		
		//Bird bird = new Bird("boncuk" , 2);
		/*
		bird.fly();
		bird.reproduce();
		bird.omnivore();
		bird.sayGreetings();
		bird.setNumberOfOffsprings(5);
		bird.setPregnancyPerYear(2);
		bird.setLegNumber(2);
		
		System.out.println(bird.toString());
		
		System.out.println(bird.getName());
		System.out.println(bird.getAge());
		System.out.println(bird.getNumberOfOffsprings());
		System.out.println(bird.getPregnancyPerYear());*/
		
		//Mammal w= new Mammal("ay",5);
		/*
		w.walk();
		w.reproduce();
		w.herbivore();
		System.out.println(w.toString());
		w.setLegNumber(4);
		System.out.println(w.toString());
		System.out.println(w.getNumberOfOffsprings());
		System.out.println(w.getPregnancyPerYear());
		w.sayGreetings();*/
		
		
		Chicken c= new Chicken("tavuk",6);
		/*c.sayGreetings();
		System.out.println(Chicken.getCount());
		System.out.println(c.getCount());
		c.decrementCount();
		System.out.println(Chicken.getCount());
		c.fly();
		c.omnivore();
		c.reproduce();
		c.sayGreetings();
		System.out.println(c.toString());*/
		
		Donkey e= new Donkey("eþek",7);
		/*e.sayGreetings();
		e.herbivore();
		e.reproduce();
		System.out.println(e.getPregnancyPerYear());
		e.walk();
		e.toString();
		System.out.println(e.toString());*/
		
		
		Horse h= new Horse("at", 12);
		h.setLegNumber(6);
		/*h.sayGreetings();
		h.herbivore();
		h.reproduce();
		h.setLegNumber(6);
		System.out.println(h.toString());*/
		
		Pig p = new Pig("hýnzýr",3);
		/*p.sayGreetings();
		p.reproduce();
		p.herbivore();
		System.out.println(p.toString());*/
	
	    Raven r = new Raven("kuzgun", 9);
	  /*  r.sayGreetings();
	    r.fly();
	    r.omnivore();
	    r.reproduce();
	    System.out.println(r.toString());*/
	
	    
	    Sheep s = new Sheep("kuzu", 1);
	   /* s.sayGreetings();
	    s.herbivore();
	    s.walk();
	    s.reproduce();
	    System.out.println(s.toString());*/
	    
		
		AnimalFarm af= new AnimalFarm(10);
		System.out.println(af.getNumberOfAnimals());
		
		//af.addAnimal(animal);
		af.addAnimal(s);
		af.addAnimal(r);
		System.out.println(af.addAnimal(p));
		
		System.out.println(af.getNumberOfAnimals());
		//af.sortBasedOnAge();
		//af.removeAnimal("gak");
		//af.sortAlphabetically();
		af.sortBasedOnLegNumber();
		System.out.println(af.getNumberOfAnimals());
		//af.printAllAnimalGreetings();
		try {
		af.addAnimal(s);}
		catch(IllegalNameException q) {
			System.out.println("illegal name");
		}
		af.addAnimal(h);
		//af.addAnimal(w);
		af.addAnimal(c);
		af.addAnimal(e);
		
		System.out.println(af.getNumberOfAnimals());
		//af.sortBasedOnAge();
		//System.out.println();)
		//af.printAllAnimalNames();
		//af.printAllAnimals();
		
		System.out.println("We have a total of " + af.getNumberOfAnimals() + " animals in the farm.");
	      System.out.printf("    " + Chicken.getCount() + " of them are Chicken.Those are: \n");
	      System.out.printf("%12s %12s %18s ","Name", "Age", "Leg Number");
		/*af.printOneAnimalGreeting(w);
		af.printOneAnimalGreeting(s);
		af.printOneAnimalGreeting(c);
		af.printOneAnimalGreeting(e);
		
		af.printAllAnimalNames();
		af.printOneAnimalName(e);
		
		af.printAllAnimals();
		
		System.out.println(af.nextYearPopulationForecast());
		af.animalMovements();
		af.eatingHabits();
		*/
		//af.removeAnimal("sýrma");
		
		//af.sortBasedOnLegNumber();
		//af.searchBasedOnAge(9);
		//af.searchBasedOnName("gak");
		
		
		/*boolean result= false;
	//animalList.add(animal);
	//animalNames.add(animal.getName());
	//AnimalFarm.numberOfAnimals++;
	if(animalList.size() <= CAPACITY ) {
		for(int i=0; i< animalList.size();i++) {
			if(!(animal.getName().equals(animalNames.get(i)))){  
				result = true;
			}
			else {
				result = false;  }
		}
		
	}
	else
		result = false;
	
	if (result) {
		animalList.add(animal);
		animalNames.add(animal.getName());
		AnimalFarm.numberOfAnimals++;
	}
	 //IllegalNameException 
	else if (result == false && animalList.size() >= CAPACITY)
		throw new IllegalNameException();
		
	return result;
	
	*
	*	Animal salep = new Animal("sa",2);
	sorted.add(5,salep);
	System.out.print(sorted.get(4) + " " + "123");*/
		
		/*	
	/*Animal[] sortList = new Animal[animalList.size()];
	
	/*for(int i=0; i< animalList.size()-2;i++) {
		sorted = animalList;
	/*if((animalList.get(i).getName()).compareTo(animalList.get(i+1).getName()) > 0)  {
		//if(sorted.size()>0) {
		sorted.set(i, animalList.get(i+1));
		sorted.set(i+1, animalList.get(i));
		
	}
    }
	
	for(int i=0; i< sorted.size();i++) {
		System.out.println(sorted.get(i).toString());
	}
	for(int i=0; i< animalList.size();i++) {
		System.out.println(animalList.get(i).toString());}*/
	/*if(AnimalFarm.numberOfAnimals != 0) {
	for(int i=0; i< sortList.length;i++) {
		String name1= animalList.get(i).getName();
		for(int j=i+1; j< sorted.size()-1;j++) {
			String name2 = animalList.get(j).getName();
			if(name1.compareTo(name2)> 0) {
				sorted.add(i, animalList.get(j));
				sorted.add(j, animalList.get(i));
				//sortList[i] = animalList.get(j);
				//sortList[j] = animalList.get(i);
			}
			
		}
	}
	}
	//System.out.println(sortList[3]);
	for(int i=0; i< sorted.size();i++) {
		System.out.println(sorted.get(i).toString());
	}
	
	/*for(int i=0; i< sorted.size();i++) {
		String name1= animalList.get(i).getName();
		for(int j=i+1; j< sorted.size()-1;j++) {
			String name2 = animalList.get(j).getName();
			if(name1.compareTo(name2)> 0) {
				sorted.add(animalList.get(j));
				sorted.add(animalList.get(i));
				
			}
			
		}
	}*/
	
	//stem.out.println(sorted.get(0));*/
		
	}

}
