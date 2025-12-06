package com.app.activites.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "activites")
public class Activites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activites_id")
    private Long activitesId;

    @Column(name = "activity_name")
    private String activityName;

    @Column(name = "activity_type")
    private String activityType;

    @Column(name = "category")
    private String category;

    @Column(name = "skill_level_required")
    private String skillLevelRequired;

    @Column(name = "venue")
    private String venue;

    @Column(name = "faculty_id")
    private Long facultyId;

    @Column(name = "description")
    private String description;

    @Column(name = "skillset_description")
    private String skillsetDescription;

    @Column(name = "max_participants")
    private Integer maxParticipants;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at", insertable = false)
    private Timestamp updatedAt;

    public Long getActivitesId() {
        return activitesId;
    }
    public void setActivitesId(Long activitesId) {
        this.activitesId = activitesId;
    }

    public String getActivityName() {
        return activityName;
    }
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityType() {
        return activityType;
    }
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getSkillLevelRequired() {
        return skillLevelRequired;
    }
    public void setSkillLevelRequired(String skillLevelRequired) {
        this.skillLevelRequired = skillLevelRequired;
    }

    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Long getFacultyId() {
        return facultyId;
    }
    public void setFacultyId(Long facultyId) {
        this.facultyId = facultyId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkillsetDescription() {
        return skillsetDescription;
    }
    public void setSkillsetDescription(String skillsetDescription) {
        this.skillsetDescription = skillsetDescription;
    }

    public Integer getMaxParticipants() {
        return maxParticipants;
    }
    public void setMaxParticipants(Integer maxParticipants) {
        this.maxParticipants = maxParticipants;
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
