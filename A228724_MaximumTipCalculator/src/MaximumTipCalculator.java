import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MaximumTipCalculator {
	private int numberOfTestCases;
	private int N, X, Y;
	private Waiter rahul;
	private Waiter ankit;
	
	public MaximumTipCalculator(){
		this.numberOfTestCases = 0;
		init();
	}
	
	private void init(){		
		this.N = this.X = this.Y = 0;
		this.rahul = new Waiter("Rahul");
		this.ankit = new Waiter("Ankit");
	}
	
	public void start(){		
		this.numberOfTestCases = readTestNumber();
		for (int i = 0; i <this.numberOfTestCases; i++){
			readNXY();
			readTipPerOrderRahul(this.N);
			readTipPerOrderAnkit(this.N);
			calculatemaximumTip();
			init();
		}
	}
	
	private int readTestNumber(){
		System.out.println("Enter number of test cases ('0' to exit):");
		try{
			int tenderedCash = new Scanner(System.in).nextInt();
			if (tenderedCash == 0) System.exit(-1);
			if (tenderedCash > 105) {
				System.out.println("Sorry, 105 is the maxmimum");			
				return readTestNumber();
			}
			return tenderedCash;
		}catch(InputMismatchException ex){
			System.out.println("Sorry, we only accept round interger figures.");
			return readTestNumber();
		}	
	}
	
	private boolean readNXY(){
		System.out.println("Enter number of orders and max orders for each waiter. N,X,Y ('0' to exit):");
		try{
			String nxy = new Scanner(System.in).next().trim();
			if (nxy == "0") System.exit(-1);
			if (nxy.contains(",") && nxy.split(",").length == 3){
				String[] inputs = nxy.split(",");
				this.N = Integer.parseInt(inputs[0]);
				this.X = Integer.parseInt(inputs[1]);
				this.Y = Integer.parseInt(inputs[2]);	
				this.rahul.setMaxTipsNumber(this.X);
				this.ankit.setMaxTipsNumber(this.Y);
			}else{
				System.out.println("Sorry we expect a list of 3 comma delimited digits, e.g 1,2,3");
				return readNXY();
			}
			return true;
		}catch(NumberFormatException ex){
			System.out.println("Sorry, we only accept round interger figures.");
			return readNXY();
		}
	}
	
	private void readTipPerOrderRahul(int count){
		System.out.println("Enter a list of " + count + " comma delimited digits as tips for each of the " + count + " orders for waiter 1 ('0' to exit):");
		try{
			String tips = new Scanner(System.in).next();
			if (tips.contains(",") && tips.split(",").length == count){
				String[] inputs = tips.split(",");
				for (String value : inputs){
					Tip tip = new Tip();
					tip.setTipAmount(Integer.parseInt(value));
					this.rahul.addTip(tip);
				}
			}else{
				System.out.println("Sorry we expect a list of " + count + " comma delimited digits as tips for each of the " + count + " orders for waiter 1 ('0' to exit)");
				readTipPerOrderRahul(count);
			}
		}catch(NumberFormatException ex){
			System.out.println("Sorry, we only accept round interger figures.");
			readTipPerOrderRahul(count);
		}
	}
	
	private void readTipPerOrderAnkit(int count){
		System.out.printf("Enter a list of " + count + " comma delimited digits as tips for each of the " + count + " orders for waiter 2 ('0' to exit):");
		System.out.println("");
		try{
			String tips = new Scanner(System.in).next();
			if (tips.contains(",") && tips.split(",").length == count){
				String[] inputs = tips.split(",");
				for (String value : inputs){
					Tip tip = new Tip();
					tip.setTipAmount(Integer.parseInt(value));
					this.ankit.addTip(tip);
				}
			}else{
				System.out.println("Sorry we expect a list of " + count + " comma delimited digits as tips for each of the " + count + " orders for waiter 1 ('0' to exit):");
				readTipPerOrderRahul(count);
			}
		}catch(NumberFormatException ex){
			System.out.println("Sorry, we only accept round interger figures.");
			readTipPerOrderRahul(count);
		}
	}
	
	private int calculatemaximumTip(){
		int maxSum = 0;
		for (int i = 0; i < this.N; i++){
			int x = this.rahul.getTips().get(i).getTipAmount();
			int y = this.ankit.getTips().get(i).getTipAmount();
			maxSum += Math.max(x, y);
		}
		System.out.println("Maximum tip: " + maxSum);
		return 0;
	}
}
