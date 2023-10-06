package customException;

public class InvalidPasswordException extends RuntimeException{
	private String Message;

	InvalidPasswordException(String Messange){
		this.Message=Messange;
	}

	@Override
	public String getMessage() {
		return Message;
	}
}
