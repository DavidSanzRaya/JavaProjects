package level1;

public class EmptySaleException extends Exception {

	public EmptySaleException() {
		super();
	}

	public EmptySaleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmptySaleException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmptySaleException(String message) {
		super(message);
	}

	public EmptySaleException(Throwable cause) {
		super(cause);
	}
}
