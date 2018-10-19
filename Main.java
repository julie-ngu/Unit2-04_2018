/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Main file for MrCoxallStack program
 *
 ****************************************************************************/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//gets input from user for stack
		Stack userStack = new Stack();
		Scanner userInput = new Scanner(System.in);
		
		do {
			System.out.print("Enter a positive integer to add (-1 to exit, -2 to remove number, -3 to clear stack, -4 to peek):\n");
			if(userInput.hasNextInt()) {
				int userNum = userInput.nextInt();
				
				if(userNum == -1) {
					System.out.print("\nGoodbye.");
					break;
				}
				else if(userNum == -2) {
					userStack.pop();
				}
				else if(userNum == -3) {
					userStack.clear();
				}
				else if(userNum == -4) {
					userStack.peek();
				}
				else if(userNum > -4){
					userStack.push(userNum);
				}
				else {
					System.out.print("\nInvalid.");
				}
			}
			else {
				System.out.print("\nError: Illegal Input");
				break;
			}
			System.out.println("\n");
			
		} while (true);	
	}
}
