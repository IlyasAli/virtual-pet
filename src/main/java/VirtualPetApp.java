import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet turtle = new VirtualPet();
		Scanner input = new Scanner(System.in);
		
		int userChoice = 0;
		
		turtle.turtle();
		
		turtle.tick();
	    
		System.out.println("\n\nTimmy the turtle\nhungry: " + turtle.getHungry()
        + "\nthirsty: " + turtle.getThirsty() + "\nbored: " + turtle.getBored() + "\ntired: " 
        + turtle.getTired() + "\n\n");
    
        //ask for user Input now
        System.out.println("What do you want to Do?\n1. Feed Turtle\n2. give Turtle water"
                + "\n3. play with Turtle \n4. put Turtle to sleep\n\n");
       
        	userChoice = input.nextInt();
	        switch (userChoice) {
	        
	        case 1: 
	            if (turtle.getHungry() <= 6) {
	                System.out.println("The pet is full you dont have to Feed him");
	            }else {
	                turtle.feed();
	                System.out.println("Thank you, You Fed the Timmy");
	            }
	            
	        break;
	            
	        case 2: System.out.println("You gave Timmy water");
	        break;
	        
	        case 3: System.out.println("You played with Timmy");
	    	        break; 
	        case 4:System.out.println("You put Timmy to sleep");
	        break;
	        
	        }
	        
	       

	        System.out.println("\n\nNow Timmy the Turtle is: \nHunger: " + turtle.getHungry() + "\nThirst: " + turtle.getThirsty()
            + "\nPlay: " + turtle.getBored() + "\nTired: " + turtle.getTired() + "\n\n");
	
	        userChoice = input.nextInt();
	        
	        System.out.println("Goodbye");	        
	        
	        
	        
	}
		
	}

