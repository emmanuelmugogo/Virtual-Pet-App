import java.util.Random;

public class VirtualPet {
	
	//Attributes
	
	private int thirsty = 0;
	private int sleepy = 0;
	private int hungry = 0;
	
	final String name = "TEDDY";
	final String color = "WHITE";
	final int age = 13;
	
	//This generates just a random number between 1 - 12.
	private Random random = new Random();
	
	public int getRandomNum() {
		return random.nextInt(12) + 1;
	}
	
	public int getThirsty() {
		return thirsty;
	}
	
	public int getSleepy() {
		return sleepy;
	}
	
	public void sleep() {
		sleepy-= 5;
		hungry += 5;
		thirsty += 3;
	}
	
	public int getHungry() {
		return hungry;
	}
	
	public void feedBear() {
		hungry -= 8;
		thirsty += 4;
		sleepy += 2;
	}
	
	public void drinkWater() {
		thirsty -= 4;
		sleepy -= 2;
	}
	
	public void tick() {
		thirsty += getRandomNum();
		sleepy += getRandomNum();
		hungry += getRandomNum();
	}
	
	
	public static void teddybear() {
		System.out.println("            ___   .--. ");
		System.out.println("      .--.-\"   \"-' .- |");
		System.out.println("     / .-,`          .'");
		System.out.println("     \\   `           \\");
		System.out.println("      '.            ! \\");
		System.out.println("        |     !  .--.  |");
		System.out.println("        \\        '--'  /.____");
		System.out.println("       /`-.     \\__,'.'      `\\");
		System.out.println("    __/   \\`-.____.-' `\\      /");
		System.out.println("    | `---`'-'._/-`     \\----'    _");
		System.out.println("    |,-'`  /             |    _.-' `\\");
		System.out.println("   .'     /              |--'`     / |");
		System.out.println("  /      /\\              `         | |");
		System.out.println("  |   .\\/  \\      .--. __          \\ |");
		System.out.println("   '-'      '._       /  `\\         /");
		System.out.println("               `\\    '     |------'`");
		System.out.println("                 \\  |      |");
		System.out.println("                  \\        /");
		System.out.println("                   '._  _.'");
		System.out.println("                      ``");
		
	}


}
