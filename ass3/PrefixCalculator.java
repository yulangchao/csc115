import java.io.*;
import java.util.*;


public class PrefixCalculator{

	
	
	public static void main (String[] args) throws StackEmptyException {
		Stack<Integer> l = new LLStack<Integer>();
		// store from back
		for (int i = args.length-1; i >= 0; i--) {
			if (args[i].equals("+")) {
				add(l);
			} else if (args[i].equals("-")) {
				subtract(l);
			} else if (args[i].equals("x")) {
				multiply(l);
			} else if (args[i].equals("/")) {
				divide(l);
			} else {
				try {
					l.push(Integer.parseInt(args[i]));
				} catch (NumberFormatException e) { 
					error();
				}
			}
		}
 
		if (l.size() != 1) { 
			error();
		} else {
			System.out.println(l.peek());
		}
	}
	


	public static void add(Stack<Integer> l) {
		try {
			int x = l.pop();
			int y = l.pop();
			l.push(x + y);
		} catch (StackEmptyException e) {
			error();
		}
	}
	
	public static void subtract(Stack<Integer> l) {
		try {
			int x = l.pop();
			int y = l.pop();
			l.push(x - y);
		} catch (StackEmptyException e) {
			error();
		}
	}
	
	public static void multiply(Stack<Integer> l) {
		try {
			int x = l.pop();
			int y = l.pop();
			l.push(x * y);
		} catch (StackEmptyException e) {
			error();
		}
	}
	
	public static void divide(Stack<Integer> l) {
		try {
			int x = l.pop();
			int y = l.pop();
			l.push(x / y);
		} catch (StackEmptyException e) {
			error();
		}
	}
	
	public static void error() {
		System.out.println("Invalid expression.");
		System.exit(0);
	}
}