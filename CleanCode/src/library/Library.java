package library;

import library.exceptions.EditionAlreadyExistsException;
import library.exceptions.EditionDoesNotExistException;

import java.util.List;

public class Library {
    String name;
    String address;
    String workingSchedule;
    List<Edition> editionsInTheLibrary;

    public Library(String libraryName, String libraryAddress, String workingSchedule) {
        super();
        this.name = libraryName;
        this.address = libraryAddress;
        this.workingSchedule = workingSchedule;
    }

    public void add(Edition edition) throws EditionAlreadyExistsException {
        if (checkIfEditionExists(edition)) {
            throw new EditionAlreadyExistsException();
        }
        editionsInTheLibrary.add(edition);
    }

    public void remove(Edition edition) throws EditionDoesNotExistException {
        if (!checkIfEditionExists((edition))) {
            throw new EditionDoesNotExistException();
        }
        editionsInTheLibrary.remove(edition);

    }

    public boolean checkIfEditionExists(Edition editionToBeChecked) {
        return this.editionsInTheLibrary.contains(editionToBeChecked);
    }
}
