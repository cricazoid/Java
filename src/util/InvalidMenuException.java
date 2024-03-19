package util;

public class InvalidMenuException extends Exception {

	private String message = "Escolha um NÚMERO de 1 a 5!!";
	public InvalidMenuException(String message) {
        super(message);

	}
}
