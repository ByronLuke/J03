package WeekOne.JavaClass;

import java.util.ArrayList;
import java.util.Scanner;

public class thePhoneBook {

    boolean running = true;
    ArrayList<contact> contactList = new ArrayList<contact>();

    public void displayWelcomeMessage() {
        System.out.println("*-------------------------*");
        System.out.println("Welcome to your phone book!");
        System.out.println("*-------------------------*");

    }

    /*
     * public void displayMenuGetChoice() {
     * 
     * do {
     * System.out.println("1. Add a contact");
     * System.out.println("2. Remove a contact");
     * System.out.println("3. List all contacts");
     * System.out.println("4: To exit.");
     * Scanner scanner2 = new Scanner(System.in);
     * int input = scanner2.nextInt();
     * 
     * switch (input) {
     * 
     * case 1:
     * addContact();
     * break;
     * case 2:
     * removeContact(contactList);
     * break;
     * case 3:
     * getcontactList();
     * break;
     * case 4:
     * running = false;
     * break;
     * default:
     * System.out.println("Please choose 1-4");
     * }
     * 
     * } while (running);
     * 
     * }
     */
    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        contact newContact = new contact();

        System.out.print("First name: ");
        String firstName = scanner.next();
        newContact.setName(firstName);

        System.out.print("Second name: ");
        String middleName = scanner.next();
        newContact.setMiddleName(middleName);

        System.out.print("Last name: ");
        String lastName = scanner.next();
        newContact.setLastName(lastName);

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
            System.out.println(contactList.get(i).getLastName());
        }

    }

    public void removeContact(thePhoneBook phoneBook) {
        System.out.print("What is the first name of the contact you would like to remove:");
        Scanner scanner = new Scanner(System.in);
        String removeByFirstName = scanner.next();
        for (contact person : phoneBook.contactList) {
            if (removeByFirstName.equals(person.getName())) {
                System.out.println(person.getName());
                phoneBook.contactList.remove(person);
                break;
            }

        }
    }

}
