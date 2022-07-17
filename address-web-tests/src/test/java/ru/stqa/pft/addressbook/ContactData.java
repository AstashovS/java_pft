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
    private final String homePhoneNumber;
    private final String mobilePhoneNumber;
    private final String workPhoneNumber;


    public ContactData(String firstname, String middleName, String lastName, String nickname, String title, String photo, String company, String address, String homePhoneNumber, String mobilePhoneNumber, String workPhoneNumber) {
        this.firstname = firstname;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.title = title;
        this.photo = photo;
        this.company = company;
        this.address = address;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.workPhoneNumber = workPhoneNumber;
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

    public String getNickname() { return nickname; }

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

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getMobilePhoneNumber () {
        return mobilePhoneNumber;
    }

    public String getWorkPhoneNumber () {
        return workPhoneNumber;
    }

}
