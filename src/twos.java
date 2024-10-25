
/** 
* Name:
* Date:
* Program Description:
*
* Testing Scenarios:
* 1.  
*
* 2.
*
* 3.
*
* 4.
*
* 5.
*
* (more if necessary!)
*/
package date;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Twos {
	public static void main(String args[]) {
		System.out.println(whichway());
	}
	public static boolean whichway() {
		boolean success = false;
		Scanner which = new Scanner(System.in);
		System.out.println("Please enter a 1 to go from 2's compliment "
				+ "or 0 to convert to it");
		while(true) {
			try {
				int x = which.nextInt();
				if (x == 0 || x == 1) {
					return x==1;
				} else {
					System.out.println("Please enter a zero or one");
			}
			}catch(InputMismatchException f) {
				System.out.println("Error, please enter a 0 or 1");
			}
			
			
		}
	}
	public static void twostodecimal() {
		String str = "";
		int rand = ((int) (Math.random() - .5)) * 255;
		int q = rand.toString();
		int correct = ~(Integer.toString(rand))+1;
		System.out.println("Convert " + y + " to decimal");
		Scanner kb = new Scanner(System.in);
		try {
			int ans = kb.nextInt();  
			if (ans == correct) {
				System.out.println("Correct");
				break;
			}else {
				System.out.println("Sorry but thats wrong, the answer is " + correct);
				break;
			}
		}catch (InputMismatchException fail){
			System.out.println("Not a number, incorrect");
		}
	}
}