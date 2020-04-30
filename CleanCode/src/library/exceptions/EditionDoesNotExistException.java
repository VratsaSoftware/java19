package library.exceptions;

public class EditionDoesNotExistException extends Exception {
    public EditionDoesNotExistException() {
        super("The edition requested does not exist");
    }
}
