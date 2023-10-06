package CheckedException;

public class AgeInvalidException extends Exception {
	private String message;

	AgeInvalidException(String message){
		this.message=message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
