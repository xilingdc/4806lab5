package com.example.webcontent.app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BuddyInfo {
    @Id
    private long id;
    private String name;
    private String phone;
//    private String address;
    /*@ManyToOne
    private com.example.webcontent.app.AddressBook addressBook;*/

    public BuddyInfo() {
    }

    public BuddyInfo(String name, String num) {
        this.name = name;
//        this.address=address;
        this.phone=num;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

//    public String getAddress() {
//        return address;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

/*
    public String toString(){
        return "Name: "+name+" Phone: "+phone;
    }
*/

//    public void setAddress(String address) {
//        this.address = address;
//    }
}
