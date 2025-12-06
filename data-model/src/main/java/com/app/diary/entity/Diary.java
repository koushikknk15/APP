package com.app.diary.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "diary")
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "class_id", nullable = false)
    private Long classId;

    @Column(name = "task_detail", nullable = false, length = 3000)
    private String taskDetail;

    @Column(name = "section_name")
    private String sectionName;

    @Column(name = "notification_id", unique = true)
    private Long notificationId;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", insertable = false)
    private Timestamp updatedAt;

    // ---------------- GETTERS & SETTERS ----------------

    public Long getTaskId() {
        return taskId;
    }
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getClassId() {
        return classId;
    }
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getTaskDetail() {
        return taskDetail;
    }
    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public String getSectionName() {
        return sectionName;
    }
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Long getNotificationId() {
        return notificationId;
    }
    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
