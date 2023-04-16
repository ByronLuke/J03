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
            System.out.println("2. Remove a contact");
            System.out.println("3. List all contacts");
            System.out.println("4. Search for contact");
            System.out.println("5: To exit." + "\n");
            System.out.print("Number: ");
            Scanner scanner2 = new Scanner(System.in);
            input = scanner2.nextInt();

            switch (input) {

                case 1:
                    adressBook.addContact();
                    break;
                case 2:
                    adressBook.removeContact(adressBook);
                    break;
                case 3:
                    adressBook.getcontactList();
                    break;
                case 4:
                    adressBook.searchContact(adressBook);
                    break;
                case 5:
                    adressBook.goodbyeMessage();
                    break;
                default:
                    System.out.println("Please choose 1-5");
            }

        } while (input != 5);

    }

}
