package WeekOne.JavaClass;

import java.util.Scanner;

public class phoneBookmain {
    public static void main(String[] args) {
        int input = 0;

        thePhoneBook adressBook = new thePhoneBook();

        do {
            System.out.println("1. Add a contact");
            System.out.println("2. Remove a contact");
            System.out.println("3. List all contacts");
            System.out.println("4: To exit.");
            Scanner scanner2 = new Scanner(System.in);
            input = scanner2.nextInt();

            switch (input) {

                case 1:
                    adressBook.addContact();
                    break;
                case 2:
                    adressBook.removeContact(adressBook);
                    System.out.println("Here!");
                    break;
                case 3:
                    adressBook.getcontactList();
                    break;
                case 4:
                    System.out.println("See ya!");
                    ;
                    break;
                default:
                    System.out.println("Please choose 1-4");
            }

        } while (input != 4);

        adressBook.displayWelcomeMessage();
        // adressBook.displayMenuGetChoice();

    }

}
