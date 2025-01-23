package level2;

import java.util.*;

public class Input {
	private static Scanner scanner = new Scanner(System.in);

	public static byte readByte(String message) {
		return readInput(message, Byte.class);
	}
	
	public static int readInt(String message) {
		return readInput(message, Integer.class);
	}
	
	public static float readFloat(String message) {
		return readInput(message, Float.class);
	}
	
	public static double readDouble(String message) {
		return readInput(message, Double.class);
	}
	
	public static char readChar(String message) {
		return readInput(message, Character.class);
	}
	
	public static String readString(String message) {
		return readInput(message, String.class);
	}
	
	private static <T> T readInput(String message, Class<T> type) {
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
				else if (type == Character.class) {
					input = type.cast(scanner.nextLine().charAt(0));
					
					if(input.toString().contains("ç"))
						throw new InputUnreadableException("Not able to read input");
					
				}
				else if (type == String.class) {
					input = type.cast(scanner.nextLine());
					
					if(input.toString().contains("ç"))
						throw new InputUnreadableException("Not able to read input");
					
				}
				
			} catch(InputMismatchException | InputUnreadableException e) {
				String exceptionMessage = e.getMessage() == null ? "Format error" : e.getMessage();
				System.out.println(exceptionMessage);
				inputMismatch = true;
				
			} finally {
				scanner.nextLine();
			}
		} while(inputMismatch);
		
		return input;
	}
	
}
