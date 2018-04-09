import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author A228724
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instantiate object for use in checking if the given numbers (input) are divisible by 8
		Mod_8 mod8 = new Mod_8();
		
//		int x = 8 % 3;
//		System.out.print(0);
		
		// instantiate object to use for accepting user input from the console
//		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This program will test if input numbers a divisible by 8");
//		System.out.println("Please enter number of test cases to perfom (integers only) '0' will terminate the program: ");
//		try{
//			int inputValue = scanner.nextInt();
//			if (inputValue == 0){
//				System.exit(-1);
//			}else {
//				mod8.setNumberOfTestCases(scanner.nextInt());
//			}
//		}catch(InputMismatchException ex){
//			System.out.println("This program excepts integers only, enter '0' to try again or '1' to exit");
//			main(args);
//		}
//		System.out.println("Please enter a list of numbers of test to if they're divisible by 8 (integers only): ");
//		for (int x = 0; x < mod8.getNumberOfTestCases(); x++){
//			mod8.addListOfValuesToTestDivisibility(scanner.nextInt());
//		}
//		mod8.perfomMod();
////		System.out.println(mod8.getNumberOfTestCases());
//		main(args);
		
		perfom(mod8);
	}
	
	private static void perfom(Mod_8 mod8){
		// instantiate object to use for accepting user input from the console
		Scanner scanner = new Scanner(System.in);
		
		// 1.
		System.out.println("Please enter number of test cases to perfom (integers only) '0' will terminate the program: ");
		try{
			int inputValue = scanner.nextInt();
			if (inputValue == 0){
				System.exit(-1);
			}else {
				mod8.setNumberOfTestCases(inputValue);
			}
		}catch(InputMismatchException ex){
			System.out.println("This program excepts integers only, enter '0' to try again or '1' to exit");
			perfom(new Mod_8());
		}
		
		// 2.
		try{
			System.out.println("Please enter a list of numbers of test to if they're divisible by 8 (integers only): ");	
			for (int x = 0; x < mod8.getNumberOfTestCases(); x++){				
				mod8.addListOfValuesToTestDivisibility(scanner.nextInt());
				System.out.println("Enter next integer: ");			
			}
		}catch(InputMismatchException ex){
			System.out.println("This program excepts integers only, enter '0' to try again or '1' to exit");
			perfom(new Mod_8());
		}			
		mod8.perfomMod();		
	}
}
