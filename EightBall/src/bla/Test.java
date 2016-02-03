package bla;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {

		EightBall a = EightBall.getInstance();
		
		BufferedReader br = new BufferedReader(new 
				InputStreamReader(System.in)); 
				System.out.println("Enter a question."); 
				do { 
				br.readLine(); 				
				a.GetAnswer();
				} while(true); 
		

	}

}
