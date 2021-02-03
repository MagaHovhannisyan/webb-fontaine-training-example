package class7ToDoList;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class TestAPI {
    DataProvider object = DataProvider.getInstance();

    @Test
    public void getAllAuthors() {
        String result = object.getAllTasks();
        Assert.assertEquals(result, "[Title0, Title1, Title2, Title3, Title4]");
    }

    @Test
    public void getAllTasksByStatusPositive() {
        String result = object.getAllTasksByStatus("In progress");
        Assert.assertEquals(result, "Title0 Title2 ");
    }

    @Test(expectedExceptions = {IllegalArgumentException.class}, expectedExceptionsMessageRegExp = "No Task with given Status.")
    public void getAllTasksByStatusException() throws IllegalArgumentException {
        object.getAllTasksByStatus("Invalid status");
    }

    @Test
    public void getAllTasksByPriorityPositive() {
        String result = object.getAllTasksByPriority("Urgent");
        Assert.assertEquals(result, "Title3 ");
    }

    @Test(expectedExceptions = {IllegalArgumentException.class}, expectedExceptionsMessageRegExp = "No Task with given Priority.")
    public void getAllTasksByPriorityException() throws IllegalArgumentException {
        object.getAllTasksByPriority("Invalid priority");
    }

    @Test
    public void getAllTasksByAssigneePositive() {
        String result = object.getAllTasksByAssignee("Name1", "Surname1", 21);
        Assert.assertEquals(result, "Title2 ");
    }

    @Test(expectedExceptions = {IllegalArgumentException.class}, expectedExceptionsMessageRegExp = "No Task with given Assignee.")
    public void getAllTasksByAssigneeNegative() {
        object.getAllTasksByAssignee("NameInvalid", "Surname1", 21);
    }

    @Test
    public void getAllTasksByEndDatePositive() {
        String result = object.getAllTasksByEndDate(new Date(2020, 02, 01));
        Assert.assertEquals(result, "Title0 ");
    }

    @Test(expectedExceptions = {IllegalArgumentException.class}, expectedExceptionsMessageRegExp = "No Task with given End date.")
    public void getAllTasksByEndDateNegative() {
        object.getAllTasksByEndDate(new Date(2025, 02, 01));
    }
}