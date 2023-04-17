package WeekOne.JavaClass;

import java.util.Scanner;

public class phoneBookmain {
    public static void main(String[] args) {
        int input = 0;

        thePhoneBook adressBook = new thePhoneBook();
        adressBook.displayWelcomeMessage();

        do {
            System.out.println();
            System.out.println("Main menu");
            System.out.println("----------");
            System.out.println("1. Add a contact");
            System.out.println("2. Remove contact by name");
            System.out.println("3. Remove contact by number");
            System.out.println("4. Search for a contact by names");
            System.out.println("5. Search for a contact by number ");
            System.out.println("6. List of all your contacts");
            System.out.println("7: To exit" + "\n");
            System.out.print("Number: ");
            Scanner scanner2 = new Scanner(System.in);
            input = scanner2.nextInt();

            switch (input) {

                case 1:
                    adressBook.addContact();
                    break;
                case 2:
                    adressBook.removeContactByName(adressBook);
                    break;
                case 3:
                    adressBook.removeContactByNumber(adressBook);
                case 4:
                    adressBook.searchContact(adressBook);
                case 5:
                    adressBook.searchContactByNumber(adressBook);
                    break;
                case 6:
                    adressBook.getcontactList();
                    break;
                case 7:
                    adressBook.goodbyeMessage();
                    break;
                default:
                    System.out.println("Please choose 1-7");
            }

        } while (input != 7);

    }

}
