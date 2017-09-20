package assignment2.week9Mokito;

public class mokitoImplement {

	mokitoInterface intObj;

	public int add(int a, int b) {
		
		return intObj.add(a, b);
	}

	public int subtract(int a, int b) {
		
		return intObj.subtract(a, b);
	}

	public int multiply(int a, int b) {
	
		return intObj.multiply(a, b);
	}

	public int divide(int a, int b) {
	
		return intObj.divide(a, b);
	}
	
	public void setInfoObj(mokitoInterface intObj) {
		this.intObj = intObj;
	}

}
