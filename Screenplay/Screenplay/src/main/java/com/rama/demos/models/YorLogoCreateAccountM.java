package com.rama.demos.models;

public class YorLogoCreateAccountM {

    private String title;
    private String firstName;
    private String lastName;
    private String password;
    private String dateOfBirth;
    private String company;
    private String address;
    private String addressLine;
    private String city;
    private String state;
    private String postalCode;
    private String information;
    private String homePhone;
    private String mobilePhone;
    private String alias;
    private String emailAddress;

    public YorLogoCreateAccountM(String title, String emailAddress,  String firstName, String lastName, String password, String dateOfBirth, String company, String address, String addressLine, String city, String state, String postalCode, String information, String homePhone, String mobilePhone, String alias) {

        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.company = company;
        this.address = address;
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.information = information;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.alias = alias;
        this.emailAddress = emailAddress;
    }

    public String getTitle() {
        return title;
    }


    public String getEmailAddress() {
        return emailAddress;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getInformation() {
        return information;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getAlias() {
        return alias;
    }





}
