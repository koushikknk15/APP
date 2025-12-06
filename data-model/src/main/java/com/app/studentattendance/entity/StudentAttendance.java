package com.app.studentattendance.entity;
import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "student_attendance")
public class StudentAttendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_attendance_id")
    private Long studentAttendanceId;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "faculty_id")
    private Long facultyId;

    @Column(name = "class_id")
    private Long classId;

    @Column(name = "section_name")
    private String sectionName;

    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "period_number")
    private Long periodNumber;

    @Column(name = "status")
    private Boolean status;

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

    @Column(name = "attendance_date")
    private Date attendanceDate;

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


    // -------- GETTERS & SETTERS --------

    public Long getStudentAttendanceId() {
        return studentAttendanceId;
    }
    public void setStudentAttendanceId(Long studentAttendanceId) {
        this.studentAttendanceId = studentAttendanceId;
    }

    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getFacultyId() {
        return facultyId;
    }
    public void setFacultyId(Long facultyId) {
        this.facultyId = facultyId;
    }

    public Long getClassId() {
        return classId;
    }
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getSectionName() {
        return sectionName;
    }
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Long getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getPeriodNumber() {
        return periodNumber;
    }
    public void setPeriodNumber(Long periodNumber) {
        this.periodNumber = periodNumber;
    }

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
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

    public Date getAttendanceDate() {
        return attendanceDate;
    }
    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
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