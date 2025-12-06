package com.app.student.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "class_id")
    private String classId;

    @Column(name = "achievement_id")
    private Long achievementId;

    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "activites_id")
    private Long activitesId;

    @Column(name = "attendance_id")
    private Long attendanceId;

    @Column(name = "Subject_list")
    private String subjectList;

    @Column(name = "is_active")
    private Boolean isActive = true;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;


    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassId() {
        return classId;
    }
    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Long getAchievementId() {
        return achievementId;
    }
    public void setAchievementId(Long achievementId) {
        this.achievementId = achievementId;
    }

    public Long getTaskId() {
        return taskId;
    }
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getActivitesId() {
        return activitesId;
    }
    public void setActivitesId(Long activitesId) {
        this.activitesId = activitesId;
    }

    public Long getAttendanceId() {
        return attendanceId;
    }
    public void setAttendanceId(Long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public String getSubjectList() {
        return subjectList;
    }
    public void setSubjectList(String subjectList) {
        this.subjectList = subjectList;
    }

    public Boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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
