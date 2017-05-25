package data_Cache;

public class InputX {
	
	static String accelX;
	
	public InputX(String valueX){
		accelX = valueX;
	}
	
	public void displayX(){
		System.out.println(accelX);
	}
	
	public static void main(String[] args){
		InputX storeX = new InputX(accelX);
		storeX.displayX();
	}
}