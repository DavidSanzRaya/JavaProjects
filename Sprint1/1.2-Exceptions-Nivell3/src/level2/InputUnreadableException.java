package level2;

public class InputUnreadableException extends Exception {
	public InputUnreadableException() {
		super();
	}

	public InputUnreadableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InputUnreadableException(String message, Throwable cause) {
		super(message, cause);
	}

	public InputUnreadableException(String message) {
		super(message);
	}

	public InputUnreadableException(Throwable cause) {
		super(cause);
	}
}
