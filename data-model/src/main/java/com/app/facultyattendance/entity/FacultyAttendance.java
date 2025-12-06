package com.app.facultyattendance.entity;
import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "faculty_attendance")
public class FacultyAttendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faculty_attendance_id")
    private Long facultyAttendanceId;

    @Column(name = "class_id")
    private Long classId;

    @Column(name = "faculty_id")
    private Long facultyId;

    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "attendance_date")
    private Date attendanceDate;

    @Column(name = "check_in_time")
    private Timestamp checkInTime;

    @Column(name = "check_out_time")
    private Timestamp checkOutTime;

    @Column(name = "total_hours")
    private Double totalHours;

    @Column(name = "month_name")
    private String monthName;

    @Column(name = "total_working_days")
    private Integer totalWorkingDays;

    @Column(name = "days_present")
    private Integer daysPresent;

    @Column(name = "days_absent")
    private Integer daysAbsent;

    @Column(name = "days_on_leave")
    private Integer daysOnLeave;

    @Column(name = "half_days")
    private Integer halfDays;

    @Column(name = "day_name")
    private String dayName;

    @Column(name = "is_attended")
    private Boolean isAttended;

    @Column(name = "is_locked")
    private Boolean isLocked;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;


    // ---------------- GETTERS & SETTERS ----------------

    public Long getFacultyAttendanceId() {
        return facultyAttendanceId;
    }
    public void setFacultyAttendanceId(Long facultyAttendanceId) {
        this.facultyAttendanceId = facultyAttendanceId;
    }

    public Long getClassId() {
        return classId;
    }
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getFacultyId() {
        return facultyId;
    }
    public void setFacultyId(Long facultyId) {
        this.facultyId = facultyId;
    }

    public Long getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }
    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public Timestamp getCheckInTime() {
        return checkInTime;
    }
    public void setCheckInTime(Timestamp checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Timestamp getCheckOutTime() {
        return checkOutTime;
    }
    public void setCheckOutTime(Timestamp checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public Double getTotalHours() {
        return totalHours;
    }
    public void setTotalHours(Double totalHours) {
        this.totalHours = totalHours;
    }

    public String getMonthName() {
        return monthName;
    }
    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public Integer getTotalWorkingDays() {
        return totalWorkingDays;
    }
    public void setTotalWorkingDays(Integer totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public Integer getDaysPresent() {
        return daysPresent;
    }
    public void setDaysPresent(Integer daysPresent) {
        this.daysPresent = daysPresent;
    }

    public Integer getDaysAbsent() {
        return daysAbsent;
    }
    public void setDaysAbsent(Integer daysAbsent) {
        this.daysAbsent = daysAbsent;
    }

    public Integer getDaysOnLeave() {
        return daysOnLeave;
    }
    public void setDaysOnLeave(Integer daysOnLeave) {
        this.daysOnLeave = daysOnLeave;
    }

    public Integer getHalfDays() {
        return halfDays;
    }
    public void setHalfDays(Integer halfDays) {
        this.halfDays = halfDays;
    }

    public String getDayName() {
        return dayName;
    }
    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public Boolean getIsAttended() {
        return isAttended;
    }
    public void setIsAttended(Boolean isAttended) {
        this.isAttended = isAttended;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
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