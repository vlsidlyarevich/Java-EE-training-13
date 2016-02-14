package com.itibo.lesson13.models;

import com.itibo.lesson13.ServiceLevel;
import com.itibo.lesson13.Sex;
import com.sun.istack.internal.NotNull;

public class UserModel {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private Sex sex;

    @NotNull
    private String dateOfBirth;

    @NotNull
    private String mail;

    @NotNull
    private ServiceLevel serviceLevel;

    public UserModel(){
        firstName = "";
        lastName = "";
        serviceLevel = ServiceLevel.Basic;
        sex = Sex.woman;
        dateOfBirth = "";
        mail = "";
    }

    public UserModel(String firstName, String lastName, Sex sex, String dateOfBirth, String mail, ServiceLevel serviceLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.serviceLevel = serviceLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex.toString();
    }

    public void setSex(String sex) {
        this.sex = Sex.getSex(sex);
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getServiceLevel() {
        return serviceLevel.toString();
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = ServiceLevel.getServiceLevel(serviceLevel);
    }

    @Override
    public String toString() {
        if (!firstName.isEmpty()) {
            return
                    "Name: " + firstName + ' '
                            + lastName +
                            "\nSex: " + sex +
                            "\nDate of birth: " + dateOfBirth +
                            "\nMail: " + mail +
                            "\nService level: " + serviceLevel;
        }
        else return "";
    }
}
