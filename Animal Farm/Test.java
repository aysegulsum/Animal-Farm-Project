import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Ayþe Gülsüm EREN 150120005
		
		//Create scanner
		Scanner input= new Scanner(System.in);
		
		//prompt the user to enter capacity
		System.out.print("Welcome to Animal Farm simulation program! \r" +
		                 "Please enter the capacity of the animal farm: ");
        int capacity = input.nextInt();
        
        //create an animalFarm with given capacity
        AnimalFarm newFarm = new AnimalFarm(capacity);
        
        //show operations
        System.out.println("0 - Exit the program \n" + 
        		           "1 - Add animal \n" +
        		           "2 - Remove animal \r" +
        		           "3 - Search animal \r" +
        		           "4 - Sort animals \r" + 
        		           "5 - Calculate next year's population estimate \r" +
        		           "6 - Print all animal's movements \r" +
        		           "7 - Print all animal's eating habits \r" +
        		           "8 - Print report \r" +
        		           "Please enter your choice: ");
        
        int choice = input.nextInt();
        input.nextLine();
        
        while(choice > 0) {       	
        
        if( choice == 1) {
        	System.out.println("1 - Chicken \n" +
                             "2 - Donkey \n" +
        			         "3 - Horse \n" +
                             "4 - Pig \n" +
        			         "5 - Raven \n" +
                             "6 - Sheep \n" +
        			         "Select animal type: ");
        	int type = input.nextInt();
        	input.nextLine();
        	
        	System.out.println("Enter the name: ");
        	String name = input.nextLine();
        	
            System.out.println("Enter the age: ");  
            int age = input.nextInt();
            input.nextLine();
            
            //add an animal to the animalFarm if there is noone who has same name
            if(type == 1){
            	Animal animal = new Chicken(name , age);
            	try {
					newFarm.addAnimal(animal);
				} catch (IllegalNameException e) {
				    System.out.println("IllegalNameException");
				}
            }
            else if(type == 2) {
            	Animal animal = new Donkey(name , age);
            	try {
					newFarm.addAnimal(animal);
				} catch (IllegalNameException e) {
				    System.out.println("IllegalNameException");
				}
            }
            else if(type == 3) {
            	Animal animal = new Horse(name , age);
            	try {
					newFarm.addAnimal(animal);
				} catch (IllegalNameException e) {
				    System.out.println("IllegalNameException");
				}
            }
            else if(type == 4) {
            	Animal animal = new Pig(name , age);
            	try {
					newFarm.addAnimal(animal);
				} catch (IllegalNameException e) {
				    System.out.println("IllegalNameException");
				}
            }
            else if(type == 5) {
                Animal animal = new Raven(name , age);
                try {
					newFarm.addAnimal(animal);
				} catch (IllegalNameException e) {
				    System.out.println("IllegalNameException");
				}
            }
            else if(type == 6) {
                Animal animal = new Sheep(name , age);
                try {
					newFarm.addAnimal(animal);
				} catch (IllegalNameException e) {
				    System.out.println("IllegalNameException");
				}
            }
        }    
        else if(choice == 2) {
        	System.out.println("What is the animal's  name?");
        	String name = input.nextLine();
        	newFarm.removeAnimal(name);
        }
        else if(choice == 3) {
        	System.out.println("1 - Search based on name");
        	System.out.println("2 - Search based on age");
        	int num = input.nextInt();
        	input.nextLine();
        	
        	if(num == 1) {
            	System.out.println("Enter name:");
            	String name = input.nextLine();
            	newFarm.searchBasedOnName(name);
        	}
        	else {
        		System.out.println("Enter age:");
        		int age = input.nextInt();
        		input.nextLine();
        		newFarm.searchBasedOnAge(age);
        	}
        }
        else if(choice == 4) {
        	System.out.println("1 - Sort based on name \n" + 
                               "2 - Sort based on leg number \n" +
        			           "3 - Sort based on age \n" +
                               "4 - Sort based on addition date");
        	int type = input.nextInt();
        	input.nextLine();
        	
        	switch(type) {
        	case 1:newFarm.sortAlphabetically(); break;
        	case 2:newFarm.sortBasedOnLegNumber(); break;
        	case 3:newFarm.sortBasedOnAge(); break;
        	case 4:newFarm.printAllAnimals(); break;
        	}
        }
        else if(choice == 5) {
           System.out.println(newFarm.nextYearPopulationForecast());
        }
        else if(choice == 6) {
            newFarm.animalMovements();	
        }
        else if(choice == 7) {
            newFarm.eatingHabits(); 	
        }
        else { 
        	System.out.println("Enter filename:");
        	String fileName = input.nextLine();
        	try {
				newFarm.printReport(fileName);
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			}
        }
        
       System.out.println("\n" +
    		     "0 - Exit the program \n" + 
		         "1 - Add animal \n" +
		         "2 - Remove animal \n" +
		         "3 - Search animals \n" +
		         "4 - Sort animals \r" + 
		         "5 - Calculate next year's population estimate \n" +
		         "6 - Print all animal's movements \n" +
		         "7 - Print all animal's eating habits \n" +
		         "8 - Print report \n" +
		         "Please enter your choice: ");

                 choice = input.nextInt(); 
                 input.nextLine();
        }
        //terminating message
        if(choice == 0) {
        	System.out.println("See you :)");
        }
        
        input.close();
	}

}
