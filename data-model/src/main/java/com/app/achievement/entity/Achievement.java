package com.app.achievement.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.sql.Date;

@Entity
@Table(name = "achievement")
public class Achievement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achivement_id")
    private Long achivementId;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "activity_id")
    private Long activityId;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "achievement_level")
    private String achievementLevel;

    @Column(name = "description")
    private String description;

    @Column(name = "positions")
    private String positions;

    @Column(name = "award")
    private String award;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "certificate_url")
    private String certificateUrl;

    @Column(name = "achieved_date")
    private Date achievedDate;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    // ---------------- GETTERS & SETTERS ----------------

    public Long getAchivementId() {
        return achivementId;
    }
    public void setAchivementId(Long achivementId) {
        this.achivementId = achivementId;
    }

    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getActivityId() {
        return activityId;
    }
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getAchievementLevel() {
        return achievementLevel;
    }
    public void setAchievementLevel(String achievementLevel) {
        this.achievementLevel = achievementLevel;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getPositions() {
        return positions;
    }
    public void setPositions(String positions) {
        this.positions = positions;
    }

    public String getAward() {
        return award;
    }
    public void setAward(String award) {
        this.award = award;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCertificateUrl() {
        return certificateUrl;
    }
    public void setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
    }

    public Date getAchievedDate() {
        return achievedDate;
    }
    public void setAchievedDate(Date achievedDate) {
        this.achievedDate = achievedDate;
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
