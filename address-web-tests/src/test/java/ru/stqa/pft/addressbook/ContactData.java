package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstname;
    private final String middleName;
    private final String lastName;
    private final String nickname;
    private final String title;
    private final String photo;
    private final String company;
    private final String address;
    private final String home;
    private final String phoneNumber;
    private final String work;

    public ContactData(String firstname, String middleName, String lastName, String nickname, String title, String photo, String company, String address, String home, String phoneNumber, String work) {
        this.firstname = firstname;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.title = title;
        this.photo = photo;
        this.company = company;
        this.address = address;
        this.home = home;
        this.phoneNumber = phoneNumber;
        this.work = work;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getPhoto() {
        return photo;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWork() {
        return work;
    }
}
