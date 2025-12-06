package com.app.address.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "door_no", nullable = false)
    private String doorNo;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "village_or_Town", nullable = false)
    private String villageOrTown;

    @Column(name = "District")
    private String district;

    @Column(name = "State")
    private String state;

    @Column(name = "pincode", nullable = false)
    private String pincode;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", insertable = false)
    private Timestamp updatedAt;


    public Long getAddressId() {
        return addressId;
    }
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getVillageOrTown() {
        return villageOrTown;
    }
    public void setVillageOrTown(String villageOrTown) {
        this.villageOrTown = villageOrTown;
    }

    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
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
