package WeekOne.JavaClass;

import java.util.Scanner;

//import java.lang.reflect.Method;
//import java.util.Scanner;

public class LabTwo{
/*
//Write a method to prompt the user to enter the radius 
//of the circle then calculate the area and circumference of the circle.
public static void main(String[] args) {
    // Scanner
    Scanner scanner = new Scanner(System.in);
    // Ask question
    System.out.println("What is the radius");
    //Variables
    double radius = scanner.nextInt();
    double diameter = radius*2;
    double area = Math.PI * (radius*radius);

    // Print answers
    System.out.println("Diameter: " + diameter);
    System.out.println("Area is: " + area);
}
*/
// Question 2

//Write a method to prompt the user for base-width 
//and height of a triangle, then calculate the area of the Triangle.
public static void main(String[] args) {
    //Scanner
    Scanner scanner = new Scanner(System.in);
    //getInfo
    System.out.println("What is the base of the triangle: ");
    //Variables
    double base = scanner.nextDouble();
    System.out.println("What is the height of the triangle: ");
    double height = scanner.nextDouble();

    double area = (base * height) / 2;
    //Print the area
    System.out.print("The area is: " + area);

// Question 3
/* 
//Write a method to prompt the user for a 
//number then display check if the number is Even or Odd
public static void main(String[] args) {
    //Scanner
    Scanner scanner = new Scanner(System.in);
    //getinfo
    System.out.println("What is your number: ");
    double number = scanner.nextDouble();
    //if statements
    if (number == 0) {
        System.out.println("Your number is zero!");
    }
    else if (number%2==0){
        System.out.println("Your number is even!");
}
    else {
        System.out.println("Your number is odd!");
    }
*/
// Question 4
/* 
    //Write a method to prompt the user for an Integer then display 
    //the same value with one decimal place. eg user enter "15 " result 
    //is: "You entered 15, the new value is 15.0".
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    double integer = scanner.nextInt();
        System.out.println(integer);
*/
// Question 5
/* 
//Write a method to prompt the user for a letter of the alphabet and display it's ascii value
public static void main(String[] args) {
//Rounding a number
Scanner scanner = new Scanner(System.in);
System.out.println("What is your number: ");
double number = scanner.nextDouble();
System.out.println(Math.round(number));
*/
// Question 6
/* 
//Write a method to prompt the user for a double then display the value as a whole number. 
//eg user enter "15 .8" result is: "You entered 15.8, the new value is 16". eg user enter "15 .4" 
//result is: "You entered 15.4, the new value is 15".
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("What is your number: ");
double number = scanner.nextDouble();
double wholeNum = Math.round(number);
System.out.println("You entered " + number + ", the new value is " + wholeNum);
*/
// Question 7
/* 
//Write a method to prompt the user for 4 digits representing a year. Then determine If Year Is a Leap Year.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the year:");
    int year = scanner.nextInt();
    if (year % 4==0) {
        int step2 = year;
    if (step2%100==0){
        int step3 = step2;
    if (step3 %400==0){
        System.out.println("Leap year!");
}   else{
        System.out.println("Not a leap year!");
}
}   else{
    System.out.println("Leap Year!");
}
}
    else {
    System.out.println("Not a leap year");
}
}
*/
}
}

