/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Stack file for MrCoxallStack program
 *
 ****************************************************************************/

import java.util.ArrayList;

public class Stack {
	private static final ArrayList<Integer> stackArray = new ArrayList<Integer>();
	private int top = 1;
	
	public void print() {
		//prints entire stack
		System.out.print(stackArray);
	}
	
	public void push(int value) {
		//adds value to stack
		stackArray.add(value);
		print();
	}
	
	public void pop() {
		//removes top value from stack
		if(stackArray.size() < 0 || stackArray.size() == 0 ) {
			System.out.print("\nStack is empty.");
		}
		else {
			stackArray.remove(stackArray.size()-top);
			print();
		}
	}
	
	public void clear() {
		//clears values in stack
		if(stackArray.size() < 0 || stackArray.size() == 0 ) {
			System.out.print("\nStack is empty.");
		}
		else {
			stackArray.clear();
			System.out.print("\nStack is cleared.");
		}
	}
	
	public void peek() {
		if(stackArray.size() < 0 || stackArray.size() == 0 ) {
			System.out.print("\nStack is empty.");
		}
		else {
			System.out.print(stackArray.get(stackArray.size()-1));
		}
	}
}
