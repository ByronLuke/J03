package WeekOne.JavaClass;

import java.util.ArrayList;

class contact {
    private String name;
    private String middleName;
    private String lastName;
    private long phoneNumber;

    public contact(String name, String middleName, String lastName, WeekOne.JavaClass.adress adress) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    adress adress = new adress();

    public contact() {
    }

    public adress getAdress() {
        return adress;
    }

    public void setAdress(adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}