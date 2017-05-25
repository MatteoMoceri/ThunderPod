package data_Cache;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Read_Packet {
	
	public static String Line;
	//public static char dataChar = Line.charAt(2);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
        BufferedReader readPack = new BufferedReader(new FileReader("C:/Users/Mama Mo/Documents/Java_Test.txt"));
           String line = null;
           Line = line;
           while((line = readPack.readLine())!= null)
           {
               System.out.println(line);
               //System.out.println(dataChar);
           }
           readPack.close();
	}

}
