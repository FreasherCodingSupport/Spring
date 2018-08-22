package com.mycompany;

public class InquiryCommand {
    
    private String name;
    private String phone;
    private String gender;
    private Integer selectedCityId;
    private String address;
    private String[] courses;  
    private Boolean tNc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSelectedCityId() {
        return selectedCityId;
    }

    public void setSelectedCityId(Integer selectedCityId) {
        this.selectedCityId = selectedCityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    
    public Boolean gettNc() {
        return tNc;
    }

    public void settNc(Boolean tNc) {
        this.tNc = tNc;
    }
   
}
