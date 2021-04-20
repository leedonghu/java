package p10.textbook.exercise.ex07;

public class NonExistIDException extends Exception{
	public NonExistIDException() {}
	public NonExistIDException(String message) {
		super(message);
	}
}
