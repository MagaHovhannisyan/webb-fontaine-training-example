package class7ToDoList;

public enum ErrorMessagesToDo {
    INVALID_STATUS("No Task with given Status."),
    INVALID_PRIORITY("No Task with given Priority."),
    INVALID_ASSIGNEE("No Task with given Assignee."),
    INVALID_END_DATE("No Task with given End date.");

    ErrorMessagesToDo(String errorMsg) {
        this.value = errorMsg;
    }

    private final String value;

    public String getValue() {
        return value;
    }
}