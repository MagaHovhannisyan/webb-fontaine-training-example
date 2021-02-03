package class7ToDoList;

import java.util.Arrays;
import java.util.Date;

public class DataProvider {
    private static DataProvider instance;
    private Task[] task = new Task[5];
    static DataProvider object = DataProvider.getInstance();

    private DataProvider() throws IllegalArgumentException {
        task[0] = new Task("Title0", "Description0", new Date(2019, 01, 01),
                new Date(2020, 02, 01),
                Task.Priority.HIGH, new Assignee("Name0", "Surname0", 21), Task.Status.IN_PROGRESS);

        task[1] = new Task("Title1", "Description1", new Date(2018, 12, 15),
                new Date(2020, 01, 01),
                Task.Priority.MEDIUM, new Assignee("Name1", "Surname2", 25), Task.Status.DONE);

        task[2] = new Task("Title2", "Description1", new Date(2019, 04, 22),
                new Date(2020, 01, 01),
                Task.Priority.MEDIUM, new Assignee("Name1", "Surname1", 21), Task.Status.IN_PROGRESS);

        task[3] = new Task("Title3", "Description1", new Date(2019, 07, 30),
                new Date(2020, 01, 01),
                Task.Priority.URGENT, new Assignee("Name4", "Surname1", 21), Task.Status.DONE);

        task[4] = new Task("Title4", "Description4", new Date(2019, 01, 12),
                new Date(2025, 05, 01),
                Task.Priority.LOW, new Assignee("Name4", "Surname4", 21), Task.Status.ON_HOLD);
    }

    public static DataProvider getInstance() {
        if (instance == null) {
            instance = new DataProvider();
        }
        return instance;
    }

    public String getAllTasks() {
        String[] taskTitles = new String[task.length];
        for (int i = 0; i < task.length; ++i) {
            taskTitles[i] = task[i].getTitle();
        }
        return Arrays.toString(taskTitles);
    }

    public String getAllTasksByStatus(String status) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < task.length; ++i) {
            if (task[i].getStatus().getValue().equals(status)) {
                str.append(task[i].getTitle()).append(" ");
            }
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException(ErrorMessagesToDo.INVALID_STATUS.getValue());
        }
        return str.toString();
    }

    public String getAllTasksByPriority(String priority) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < task.length; ++i) {
            if (task[i].getPriority().getValue().equals(priority)) {
                str.append(task[i].getTitle()).append(" ");
            }
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException(ErrorMessagesToDo.INVALID_PRIORITY.getValue());
        }
        return str.toString();
    }

    public String getAllTasksByAssignee(String name, String surname, int age) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < task.length; ++i) {
            if (task[i].getAssignee().getName().equals(name) &&
                    task[i].getAssignee().getSurname().equals(surname) &&
                    task[i].getAssignee().getAge() == age) {
                str.append(task[i].getTitle()).append(" ");
            }
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException(ErrorMessagesToDo.INVALID_ASSIGNEE.getValue());
        }
        return str.toString();
    }

    public void deleteTasksByStatus(String status) {
        for (int i = 0; i < task.length; ++i) {
            if (task[i].getStatus().getValue().equals(status)) {
                task[i] = null;
            }
        }
    }

    public String getAllTasksByEndDate(Date endDate) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < task.length; ++i) {
            if (task[i].getEndDate().equals(endDate)) {
                str.append(task[i].getTitle()).append(" ");
            }
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException(ErrorMessagesToDo.INVALID_END_DATE.getValue());
        }
        return str.toString();
    }
}
