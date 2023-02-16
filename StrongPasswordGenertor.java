import java.util.Random;
import java.util.Scanner;

public class StrongPasswordGenerator {
	
      private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
	  private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  private static final String DIGITS = "0123456789";
	  private static final String PUNCTUATION = "!@#$%&?><";
	  private static final String ALL = LOWER + UPPER + DIGITS + PUNCTUATION;
	  
	  public static String randomPassword(int length) {
		  Random random = new Random();
		  StringBuilder password = new StringBuilder();
		  for(int i =0; i<length; i++) {
			  password.append(ALL.charAt(random.nextInt(ALL.length())));
		  }
		  return password.toString();
	  }
	  
	  public static void main(String [] args) {
		  Scanner sc = new Scanner(System.in);
		  StrongPasswordGenerator obj = new StrongPasswordGenerator();
		  int length = sc.nextInt();
		  String password = randomPassword(length);
		  System.out.println("Your strong password is " + password);  
	  }

	}
