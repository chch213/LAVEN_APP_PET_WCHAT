package com.laven.app.mybatis.dto;

public class LavenAppPetInfo extends LavenAppPetInfoKey {
    private String petname;

    private String petshortname;

    private Integer petage;

    private String petdetail;

    private String notes;

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

    public String getPetshortname() {
        return petshortname;
    }

    public void setPetshortname(String petshortname) {
        this.petshortname = petshortname;
    }

    public Integer getPetage() {
        return petage;
    }

    public void setPetage(Integer petage) {
        this.petage = petage;
    }

    public String getPetdetail() {
        return petdetail;
    }

    public void setPetdetail(String petdetail) {
        this.petdetail = petdetail;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}