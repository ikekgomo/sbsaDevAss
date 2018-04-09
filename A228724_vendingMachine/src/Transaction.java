
public class Transaction {
	private int price;
	private int tenderedCash;
	private int change;
	private int amoutOutstanding;

	public int getTenderedCash() {
		return tenderedCash;
	}
	public void setTenderedCash(int tenderedCash) {
		this.tenderedCash = tenderedCash;
	}
	public int getAmoutOutstanding() {
		return amoutOutstanding;
	}
	public void setAmoutOutstanding(int amoutOutstanding) {
		this.amoutOutstanding = amoutOutstanding;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
	public Transaction(int _price, int _tenderedCash){
		this.price = _price;
		this.tenderedCash = _tenderedCash;
		this.change = 0;
		this.amoutOutstanding = 0;
	}
	
	public void calculateChange(){
		int calculatedValue = this.tenderedCash - this.price;
		this.amoutOutstanding = calculatedValue < 0 ? calculatedValue : 0;
		this.change = amoutOutstanding == 0 ? calculatedValue : 0;
	}
	
	public void addamoutOutstanding(int _amoutOutstanding){
		this.tenderedCash += _amoutOutstanding;
	}
}
