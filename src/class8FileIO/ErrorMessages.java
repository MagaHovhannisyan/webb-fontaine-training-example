package class8FileIO;

public enum ErrorMessages {
    INVALID_FILE_PATH("Provided invalid file path."),
    NO_FILE_IN_DIRECTORY("No file in given directory."),
    NO_FILE_WITH_GIVEN_EXTENSION("No file with given extension."),
    NOREAD_NOWRITE_ACCESS("Cannot read or write in the file."),
    INVALID_FILE_SIZE("Please enter one of the following file sizes : bytes, kb, mb."),
    EMPTY_FILE("File is empty");

    ErrorMessages(String errorMsg) {
        this.value = errorMsg;
    }

    private final String value;

    public String getValue() {
        return value;
    }
}