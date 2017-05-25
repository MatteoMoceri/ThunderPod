package data_Cache;

public class Data_Output {
	
	static String intro;
	static String Password;
	
	public Data_Output(String message, String password) {
		intro = message;
		Password = password;
	 }
	
	public void printIntro(){
		System.out.println(intro);
		System.out.println(Password);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Data_Output introMessage = new Data_Output("Welcome to CloudClient. Please input your Password", "Hello");
		introMessage.printIntro();
	}
	
}



