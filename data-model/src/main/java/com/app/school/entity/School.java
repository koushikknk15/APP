package com.app.school.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "school")
public class School implements Serializable {

    @Id
    @Column(name = "school_code")
    private String schoolCode;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "principal_id")
    private Long principalId;

    @Column(name = "address_id")
    private String addressId;

    public String getSchoolCode() {
        return schoolCode;
    }
    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Long getPrincipalId() {
        return principalId;
    }
    public void setPrincipalId(Long principalId) {
        this.principalId = principalId;
    }

    public String getAddressId() {
        return addressId;
    }
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
}
