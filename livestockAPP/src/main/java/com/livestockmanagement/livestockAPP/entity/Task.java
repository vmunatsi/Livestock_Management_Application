package com.livestockmanagement.livestockAPP.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long taskId;
    private String taskTitle;
    private Date startDate;
    private Date reminderDate;
    private Date dueDate;
    private String completionStatus;
    private String details;
    private long userID;

    public Task() {
    }

    public Task(long taskId, String taskTitle, Date startDate, Date reminderDate, Date dueDate, String completionStatus, String details, long userID) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.startDate = startDate;
        this.reminderDate = reminderDate;
        this.dueDate = dueDate;
        this.completionStatus = completionStatus;
        this.details = details;
        this.userID = userID;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskTitle='" + taskTitle + '\'' +
                ", startDate=" + startDate +
                ", reminderDate=" + reminderDate +
                ", dueDate=" + dueDate +
                ", completionStatus='" + completionStatus + '\'' +
                ", details='" + details + '\'' +
                ", userID=" + userID +
                '}';
    }
}
