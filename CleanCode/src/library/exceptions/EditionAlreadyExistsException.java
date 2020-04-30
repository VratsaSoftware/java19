package library.exceptions;

public class EditionAlreadyExistsException extends Exception {
    public EditionAlreadyExistsException() {
        super("The edition already exists in the archive");
    }
}