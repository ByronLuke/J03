package WeekOne.JavaClass;

import java.util.Scanner;

class phoneBook {
    public static void main(String[] args) {
        System.out.println("Welcome to your virtual phoneBook!");
        Harry harryObject = new Harry();
        Rebecca rebeccaObject = new Rebecca();
        John johnObject = new John();
        boolean running = true;

        while (running) {
            System.out.println("What is the first name of the person you are searching for?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();

            if (name.contentEquals("John")) {
                johnObject.printJohn();
            } else if (name.contentEquals("Rebecca")) {
                rebeccaObject.printRebecca();
                ;
            } else if (name.contentEquals("Harry")) {
                harryObject.printHarry();
            } else {
                System.out.println("Not here.");
            }
            System.out.println("Yes: to search again" + "\n" + "No: to exit.");
            Scanner scanner2 = new Scanner(System.in);
            String repeatAnswer = scanner2.nextLine();
            if (repeatAnswer.endsWith("Yes")) {
                running = true;
            } else if (repeatAnswer.endsWith("No")) {
                running = false;
            } else {
                System.out.println("Please select Yes or No");
            }

        }

    }
}