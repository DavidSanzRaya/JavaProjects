package level2;

import java.util.*;

public class Input {
	private static Scanner scanner = new Scanner(System.in);

	public static byte readByte(String message) {
		byte input = 0;
		boolean inputMismatch;
		
		do {
			inputMismatch = false;
			try {				
				System.out.print("\n" + message + ": ");
				input = scanner.nextByte();
				
			} catch(InputMismatchException e) {
				
				System.out.println("Format error");
				inputMismatch = true;
			} finally {
				scanner.nextLine();
			}
		} while(inputMismatch);
		
		return input;
	}
	
	public static int readInt(String message) {
		int input = 0;
		boolean inputMismatch;
		
		do {
			inputMismatch = false;
			try {				
				System.out.print("\n" + message + ": ");
				input = scanner.nextInt();
				
			} catch(InputMismatchException e) {
				
				System.out.println("Format error");
				inputMismatch = true;
			} finally {
				scanner.nextLine();
			}
		} while(inputMismatch);
		
		return input;
	}
	
	public static float readFloat(String message) {
		float input = 0;
		boolean inputMismatch;
		
		do {
			inputMismatch = false;
			try {				
				System.out.print("\n" + message + ": ");
				input = scanner.nextFloat();
				
			} catch(InputMismatchException e) {
				
				System.out.println("Format error");
				inputMismatch = true;
			} finally {
				scanner.nextLine();
			}
		} while(inputMismatch);
		
		return input;
	}
	
	public static double readDouble(String message) {
		double input = 0;
		boolean inputMismatch;
		
		do {
			inputMismatch = false;
			try {				
				System.out.print("\n" + message + ": ");
				input = scanner.nextDouble();
				
			} catch(InputMismatchException e) {
				
				System.out.println("Format error");
				inputMismatch = true;
			} finally {
				scanner.nextLine();
			}
		} while(inputMismatch);
		
		return input;
	}
	
	// More generic method to read inputs of byte, integer, float, double
	public static <T> T readInput(String message, Class<T> type) {
		T input = null;
		boolean inputMismatch;
		
		do {
			inputMismatch = false;
			
			try {
				System.out.print("\n" + message + ": ");
				if (type == Byte.class)
					input = type.cast(scanner.nextByte());
				else if (type == Integer.class)
					input = type.cast(scanner.nextInt());
				else if (type == Float.class)
					input = type.cast(scanner.nextFloat());
				else if (type == Double.class)
					input = type.cast(scanner.nextDouble());
				else
					throw new IllegalArgumentException();
				
			} catch(InputMismatchException e) {
				System.out.println("Format error");
				inputMismatch = true;
			} finally {
				scanner.nextLine();
			}
		} while(inputMismatch);
		
		return input;
	}
	
}
