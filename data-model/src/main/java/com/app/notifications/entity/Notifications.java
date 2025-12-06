package com.app.notifications.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "notifications")
public class Notifications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
    private Long notificationId;

    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "exam_id")
    private Long examId;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "posted_at")
    private Timestamp postedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    @Column(name = "is_received_notification")
    private Boolean isReceivedNotification;


    // -------- GETTERS & SETTERS --------

    public Long getNotificationId() {
        return notificationId;
    }
    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public Long getTaskId() {
        return taskId;
    }
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getExamId() {
        return examId;
    }
    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Timestamp getPostedAt() {
        return postedAt;
    }
    public void setPostedAt(Timestamp postedAt) {
        this.postedAt = postedAt;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }
    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Boolean getIsReceivedNotification() {
        return isReceivedNotification;
    }
    public void setIsReceivedNotification(Boolean isReceivedNotification) {
        this.isReceivedNotification = isReceivedNotification;
    }
}