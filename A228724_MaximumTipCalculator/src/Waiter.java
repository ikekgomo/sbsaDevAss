import java.util.ArrayList;
import java.util.List;

public class Waiter {
	private String name;
	private List<Tip> tips;
	private int maxTipsNumber;
	
	public Waiter(String _name){
		this.name = _name;
		this.tips = new ArrayList<Tip>();
	}

	/**
	 * @return the maxTipsNumber
	 */
	public int getMaxTipsNumber() {
		return maxTipsNumber;
	}

	/**
	 * @param maxTipsNumber the maxTipsNumber to set
	 */
	public void setMaxTipsNumber(int maxTipsNumber) {
		this.maxTipsNumber = maxTipsNumber;
	}

	/**
	 * @return the tips
	 */
	public List<Tip> getTips() {
		return tips;
	}

	/**
	 * @param tips the tips to set
	 */
	public void addTip(Tip tips) {
		this.tips.add(tips);
	}
}
