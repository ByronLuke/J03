package WeekOne.JavaClass;

import java.util.ArrayList;
import java.util.Scanner;

public class thePhoneBook {

    boolean running = true;
    ArrayList<contact> contactList = new ArrayList<contact>();

    public void displayWelcomeMessage() {
        System.out.println("*-------------------------*");
        System.out.println("Welcome to your phone book!");
        System.out.println("*-------------------------*" + "\n");

    }

    public void goodbyeMessage() {
        System.out.println("*------------------*");
        System.out.println("Thanks for coming!!");
        System.out.println("*------------------*");

    }

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        contact newContact = new contact();

        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        newContact.setName(firstName);

        System.out.print("Second name: ");
        String middleName = scanner.nextLine();
        newContact.setMiddleName(middleName);

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        newContact.setLastName(lastName);

        System.out.print("Phone number: ");
        long phoneNumber = scanner.nextLong();
        newContact.setPhoneNumber(phoneNumber);

        adress newAdress = new adress();

        System.out.print("What is the street number: ");
        int streetNumber = scanner.nextInt();
        newAdress.setStreetNumber(streetNumber);

        System.out.print("What is the street name: ");
        String streetName = scanner.next();
        newAdress.setStreetName(streetName);

        System.out.print("What is the city name: ");
        String cityName = scanner.next();
        newAdress.setCityName(cityName);

        System.out.print("What is the state name: ");
        String stateName = scanner.next();
        newAdress.setStateName(stateName);

        System.out.print("What is the postal code: ");
        int postalCode = scanner.nextInt();
        newAdress.setPostalCode(postalCode);

        newContact.setAdress(newAdress);
        contactList.add(newContact);
    }

    public void getcontactList() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("\n" + contactList.get(i).getName() + " " + contactList.get(i).getMiddleName()
                    + " " + contactList.get(i).getLastName() + " (" + contactList.get(i).getPhoneNumber() + ")");
            System.out.println(contactList.get(i).getAdress().getStreetNumber() + " "
                    + contactList.get(i).getAdress().getStreetName() + " "
                    + contactList.get(i).getAdress().getCityName()
                    + " " + contactList.get(i).getAdress().getStateName() + " "
                    + contactList.get(i).getAdress().getPostalCode());
        }

    }

    public void removeContact(thePhoneBook phoneBook) {
        System.out.print("What is the name of the contact you would like to remove:");
        Scanner scanner = new Scanner(System.in);
        String removeByName = scanner.next();
        for (contact person : phoneBook.contactList) {
            if (removeByName.equals(person.getName())) {
                phoneBook.contactList.remove(person);
            } else if (removeByName.equals(person.getLastName())) {
                phoneBook.contactList.remove(person);
            }
            break;
        }

    }

    public void searchContact(thePhoneBook phoneBook) {

        System.out.print("Type one of the following to search: " + "\n" + "- Full name" + "\n"
                + "- First, middle or last name" + "\n" + "- Phone number" + "\n" + "- Information from adress" + "\n"
                + "Enter here: ");
        Scanner scanner = new Scanner(System.in);
        String searchByString = scanner.next();
        adress Adress = new adress();
        for (contact person : phoneBook.contactList) {
            if (searchByString.equalsIgnoreCase(person.getName())
                    || searchByString.equalsIgnoreCase(person.getMiddleName())
                    || searchByString.equalsIgnoreCase(person.getLastName())) {
                printContact();
            } else if ((searchByString.equals(person.getAdress().getStreetName()))
                    || (searchByString.equals(person.getAdress().getCityName()))
                    || (searchByString.equals(person.getAdress().getStateName()))) {
                printContact();
                ;
            } else if ((searchByString.equalsIgnoreCase(
                    person.getName() + " " + searchByString.equalsIgnoreCase(person.getLastName())))) {
                printContact();
                ;
            } else {
                System.out.println("Contact doesn't exist :( )");
            }
        }
    }

    public void printContact() {
        for (contact person : contactList)
            System.out.println("\n" + person.getName() + " " + person.getMiddleName() + " " + person.getLastName()
                    + "\n" + person.getPhoneNumber() + "\n" + person.adress.getStreetNumber()
                    + person.adress.getStreetName() + person.adress.getCityName() + person.adress.getStateName()
                    + person.adress.getPostalCode());
    }

}
