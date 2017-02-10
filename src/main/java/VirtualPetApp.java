import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		VirtualPet virtualPet = new VirtualPet();
		int userChoice = 0;
		
		
		
		//this print Teddy's Pic
		virtualPet.teddybear();
		
		//This will call all the methods to get the initial values
		virtualPet.tick();
		
		//Description
				System.out.println("\n\n\n########### Welcome to Virtual Pet ###############\n\n"
						+ "My Pet Name is " + virtualPet.name + " with a " + virtualPet.color 
								+ " Color He is " + virtualPet.age + " Months \n\n"
										+ virtualPet.name + 
										"\n Thirsty: " + virtualPet.getThirsty() +
										"\n Hunger: " + virtualPet.getHungry() + 
										"\n Sleepy: " + virtualPet.getSleepy() +
										"\n\n");

		
		System.out.println("\n\n\nWhat Would you like to do?\n\n1 - Give " + virtualPet.name + " some water\n"
				+ "2 - Feed " + virtualPet.name + "\n3 - Put " + virtualPet.name + " to Sleep\n"
						+ "4 - Exit");
		
		userChoice = scanner.nextInt();
		
		switch (userChoice) {
		case 1: virtualPet.drinkWater();	break;

		default:
			break;
		}
		
		scanner.close();
	}

}
