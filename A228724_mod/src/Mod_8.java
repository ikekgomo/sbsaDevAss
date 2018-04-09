import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author A228724
 *
 */
public class Mod_8 {

	private int numberOfTestCases;
	private final int valueToTestDivisibilityAgainst = 8;
	private List<Integer> listOfValuesToTestDivisibility;
	
	public Mod_8(){
		this.numberOfTestCases = 0;
		this.listOfValuesToTestDivisibility = new ArrayList();
	}
	public int getNumberOfTestCases() {
		return numberOfTestCases;
	}
	public void setNumberOfTestCases(int numberOfTestCases) {
		this.numberOfTestCases = numberOfTestCases;
	}
	public int getValueToTestDivisibilityAgainst() {
		return valueToTestDivisibilityAgainst;
	}
	public List<Integer> getListOfValuesToTestDivisibility() {
		return listOfValuesToTestDivisibility;
	}
	
	public void addListOfValuesToTestDivisibility(int ValueToTestDivisibility) {
		this.listOfValuesToTestDivisibility.add(ValueToTestDivisibility);
	}
	
	public void perfomMod(){
		for(int value: listOfValuesToTestDivisibility){
			if(valueToTestDivisibilityAgainst % value == 0){
				System.out.println(1);
			}else{
				System.out.println(-1);
			}
		}
	}
}
