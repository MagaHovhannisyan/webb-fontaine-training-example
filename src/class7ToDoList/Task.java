package class7ToDoList;

import java.util.Date;

public class Task {

    public enum Status {
        NOT_STARTED("Not started"),
        IN_PROGRESS("In progress"),
        ON_HOLD("On hold"),
        DONE("Done");

        private final String status;

        Status(String status) {
            this.status = status;
        }

        public String getValue() {
            return status;
        }
    }

    public enum Priority {
        URGENT("Urgent"),
        HIGH("High"),
        MEDIUM("Medium"),
        LOW("Low");

        private final String level;

        Priority(String level) {
            this.level = level;
        }

        public String getValue() {
            return level;
        }
    }

    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private Priority priority;
    private Assignee assignee;
    private Status status;

    Task(String title, String description, Date startDate, Date endDate, Priority priority, Assignee assignee, Status status) throws IllegalArgumentException {
        setTitle(title);
        setDescription(description);
        setPriority(priority);
        setAssignee(assignee);
        setStatus(status);
        if (startDate.after(endDate)) {
            throw new IllegalArgumentException();
        } else {
            setStartDate(startDate);
            setEndDate(endDate);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}