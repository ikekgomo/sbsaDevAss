
public class Item {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private String description;
	private int price;
	
	public Item(int _id, String _description, int _price){
		this.id = _id;
		this.description = _description;
		this.price = _price;
	}
}
