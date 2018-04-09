import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class VendingMachine {
	private List<Item> itemsOnSale;
	private int numberOfItems;
	private Transaction transaction;
	
	public VendingMachine(int _numberOfItems){
		this.numberOfItems =_numberOfItems;
		this.itemsOnSale = new ArrayList<Item>();
	}
	
	public List<Item> getItemsOnSale() {
		return itemsOnSale;
	}

	public void addItemsOnSale(Item itemsOnSale) {
		this.itemsOnSale.add(itemsOnSale);
	}
	
	public void Start(){
		load();
		readyForTransation();
	}

	private void load(){
		for (int i = 0; i < this.numberOfItems; i++)
			this.addItemsOnSale(new Item((i+1), ("Item " + (i+1)), new Random().nextInt(100)));
	}
	
	public void displayMenu(){
		System.out.println("*********************************************");
		System.out.println("\tcode\tDescription\tPrice");
		for(Item _item: this.getItemsOnSale())
			System.out.println("\t" + _item.getId() + "\t" + _item.getDescription() + "\t\tR " + _item.getPrice());
		System.out.println("*********************************************");
		System.out.println("'0' will terminate the program");
	}
	
	public void readyForTransation(){
		displayMenu();	
		int itemCode = readItemCode();
		Item _item = this.getItemsOnSale().stream().filter(i -> i.getId() == itemCode).findFirst().orElse(null);
		if (_item != null){
			int tenderedCash = readTenderdCash();
			this.transaction = new Transaction(_item.getPrice(), tenderedCash);
			this.transaction.calculateChange();
			System.out.println("Item selected:\t\t" + _item.getDescription());
			System.out.println("Price of item:\t\t" + _item.getPrice());
			System.out.println("Amount inserted\t\t" + this.transaction.getTenderedCash());
			checkTenderedCash();
			waitForAnyKeyToContinue();
			readyForTransation();
		}else{
			System.out.println("The selected item is not in stock.");
			waitForAnyKeyToContinue();
			readyForTransation();
		}
	}
	
	public void waitForAnyKeyToContinue(){
		System.out.println("Press any key to continue...");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkTenderedCash(){
		if (this.transaction.getAmoutOutstanding() == 0){
			System.out.println("Take your change:\t" + this.transaction.getChange());
			
		}else {
			System.out.println("Amount outstanding:\t" + this.transaction.getAmoutOutstanding());
			this.transaction.addamoutOutstanding(readTenderdCash());
			this.transaction.calculateChange();
			this.checkTenderedCash();
		}
	}
	
	private int readItemCode(){
		System.out.println("Enter item code");
		try{
			int itemCode = new Scanner(System.in).nextInt();	
			if (itemCode == 0) System.exit(-1);
			return itemCode;
		}catch(InputMismatchException ex){
			System.out.println("Sorry, that was an invalid option.");
			return readItemCode();
		}
	}
	
	private int readTenderdCash(){
		System.out.println("Insert cash");
		try{
			int tenderedCash = new Scanner(System.in).nextInt();
			if (tenderedCash == 0) System.exit(-1);
			return tenderedCash;
		}catch(InputMismatchException ex){
			System.out.println("Sorry, we only accept round interger figures.");
			return readTenderdCash();
		}	
	}
}
