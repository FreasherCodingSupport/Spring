package com.mycompany;

public class Emp {

    private Integer User_id;
    private String Name;
    private String Contact;
    private String Email_id;
    private String User_name;
    private String Password;
    private Integer Status;

    public Emp() {
    }

    public Emp(Integer User_id, String Name, String Contact, String Email_id, String User_name, String Password, Integer Status) {
        this.User_id = User_id;
        this.Name = Name;
        this.Contact = Contact;
        this.Email_id = Email_id;
        this.User_name = User_name;
        this.Password = Password;
        this.Status = Status;
    }

    public Emp(Integer User_id, String Contact, String User_name, String Password) {
        this.User_id = User_id;
        this.Contact = Contact;
        this.User_name = User_name;
        this.Password = Password;
    }

    public Emp(String User_name, String Password) {
        this.User_name = User_name;
        this.Password = Password;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
