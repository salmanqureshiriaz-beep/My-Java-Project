package com.FirstProject.JavaLearner.Entity;

import jakarta.persistence.*;

import javax.naming.Name;
import java.util.Date;

@Embeddable
@Table(name="Student_address")
public class Address {

    @Column(length = 50,name  ="STREET")
    private String street;

    @Column(name = "is_Open")
    private boolean isOpen;
    @Transient
    private double x;
    @Column(name="Added_Date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte[] image;

    public Address(){
super();
    }

    public Address( String street, boolean isOpen, double x, Date addedDate, byte[] image) {

        this.street = street;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }




    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
