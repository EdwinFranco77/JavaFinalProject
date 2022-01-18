import java.util.Scanner;
public class distanceConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a distance in Meters: ");
		int meters = scan.nextInt();
		if(meters <= 0){
			System.out.println("ERROR NUMBER MUST BE GREATER THAN 0");
		} else {
			Menu(meters);
		}
		scan.close();
		
	}
	public static void Menu(int meters){
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Convert to Kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit program");
		int choice = scan.nextInt();
		if (choice == 1) {
			Kilometers(meters);
		}else if (choice == 2) {
			Inches(meters);
		}else if (choice == 3) {
			feet(meters);
		}else if (choice == 4) {
			Endprogram();
		}
		scan.close();
	}
	public static void Kilometers(int meters) {
		double kilometers = (meters * 0.001);
		System.out.println("The amount you entered is "+kilometers+" Kilometers");
	}
	public static void Inches(int meters) {
		double inches = (meters*39.37);
		System.out.println("The amount you entered is "+inches+" Inches");
	}
	public static void feet(int meters){
		double feet = (meters*3.281);
		System.out.println("The amount you entered is "+feet+" Feet");
	}
	public static void Endprogram() {
		System.out.println("Bye!");
		System.exit(0);
	}
} 
