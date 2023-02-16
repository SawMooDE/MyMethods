import java.util.Scanner;

public class HypotenuseCalculator{

	public static Scanner sc = new Scanner(System.in);
	public static double sideA = 0; 
	public static double sideB = 0;
	public static double hypo  = 0;
	public static String toFind = "";
	
	HypotenuseCalculator(){
System.out.println("Enter which you want to find : S for Side or H for Hypotenuse");
toFind = sc.nextLine();
	}
	
	public static void main(String[] args) {
		
		HypotenuseCalculator obj = new HypotenuseCalculator();
		
		switch(toFind) {
		
		case "H":
			System.out.println("Enter Side1 : ");
			sideA = sc.nextDouble();
			System.out.println("Enter Side2 : ");
			sideB = sc.nextDouble();
			hypo = Math.sqrt(Math.pow(sideA,2)+Math.pow(sideB,2));
			System.out.println("The hypotenuse is " + hypo);
			break;
			
		case "S":
			System.out.println("Enter Side : ");
			sideA = sc.nextDouble();
			System.out.println("Enter Hypotenuse : ");
			hypo = sc.nextDouble();
			sideB = Math.sqrt(Math.pow(hypo,2)-Math.pow(sideA,2));
			System.out.println("The side is " + sideB);
			break;
			
		default:
				System.out.println("Invalid input");
				break;
		}
	}
}
