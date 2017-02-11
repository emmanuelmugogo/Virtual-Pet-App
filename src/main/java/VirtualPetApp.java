import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		VirtualPet virtualPet = new VirtualPet();
		int userChoice = 0;
		
		
		
		
		//this print Teddy's Pic
		System.out.println("\n\n\n########### Welcome to Virtual Pet ###############\n\n"
				+ "This is How my Pet looks like\n\n");
		
				virtualPet.teddybear();
		
		
		//This will call all the methods to get the initial values
		virtualPet.tick();
		
		//Description
				System.out.println("My Pet Name is " + virtualPet.name + " with a " + virtualPet.color 
								+ " Color, He is about " + virtualPet.age + " Human Months \n\n"
										+ "Here is how " + virtualPet.name +  " feels right now"	
										+ "\n\t Thirsty: " + virtualPet.getThirsty() +
										"\n\t Hunger: " + virtualPet.getHungry() + 
										"\n\t Sleepy: " + virtualPet.getSleepy() +
										"\n\n");

		
		System.out.println("\n\n\nWhat Would you like to do?\n\n1 - Give " + virtualPet.name + " some water\n"
				+ "2 - Feed him" + "\n3 - Put " + virtualPet.name + " to Sleep\n"
						+ "4 - Do Nothing, leave him Alone!!");
		
		
		userChoice = scanner.nextInt();
		
			switch (userChoice) {
			case 1: 
				if(virtualPet.getThirsty() > 4) {
					virtualPet.drinkWater();
					System.out.println("\n\nThanks!!\nYou gave my Pet some water");
				}else {
					System.out.println("\n\nOoooops it looks like my Pet dont need some water right now, Thanks anyWay!!");
					System.exit(0);
				}
				break;
				
			case 2: 
				if(virtualPet.getHungry() > 3) {
					virtualPet.feedBear();
					System.out.println("\n\nThanks for Feeding my Pet, it looks like he didn't for more than 3 hours...");
				}else {
					System.out.println("\n\nMmmmh it looks like " + virtualPet.name + " just had some food...");
					System.exit(0);
				}
				
				break;
			
			case 3: 
				if (virtualPet.getSleepy() > 6) {
					virtualPet.goToSleep();
					System.out.println("\n\nYou've just put " + virtualPet.name + " to sleep 'Zzzz!'");
				}else {
					System.out.println("\n\n" + virtualPet.name + " Will not go to Sleep, He is still wide Awake" );
					System.exit(0);
				}
			break;
			
			case 4: 
					System.out.println("\n\nThank for leaving my Pet Alone, \n\tBye Bye..!!");
					System.exit(0);
			break;

			default:
				System.out.println("\n\nOoops It looks like you had a wrong choice.\n\tBye..! Bye..!");
				System.exit(0);
				
			}
			
		
		
		
		System.out.println("\n\n\n\nNow it looks like" + virtualPet.name +	" is:\n\t Thirsty: " + virtualPet.getThirsty() +
										"\n\t Hunger: " + virtualPet.getHungry() + 
										"\n\t Sleepy: " + virtualPet.getSleepy());
		
		scanner.close();
	}

}
