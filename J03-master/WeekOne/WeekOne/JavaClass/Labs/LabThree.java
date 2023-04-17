package WeekOne.JavaClass.Labs;

/**
 * LabThree
 */
public class LabThree {

    public static void main(String[] args) {
        /*
         * System.out.println(vowelNum());
         * System.out.println(noDupes());
         * System.out.println(Average());
         */
        vowelNum();

        // Write a method to display first non repeated character of a string then the
        // repeating characters. E.g. input morning should display morignn
        // Variables
        // String word = "morning";
        // String newWord= "";
        // String dupes ="";
        // //char array the word
        // char[] wordAsChar = word.toCharArray();
        // char[] newWordAsChar = newWord.toCharArray();
        // // for loop that runs through each character of word and compares each
        // character to another loop
        // for (int i = 0; i < wordAsChar.length; i++) {
        // for (int j = 0; j < wordAsChar.length; j++) {
        // if (!newWord.contains(wordAsChar[i] + "")){
        // newWord += wordAsChar[i];
        // }
        // if (wordAsChar[i] == newWordAsChar[j]){
        // dupes += wordAsChar[i];
        // }
        // System.out.println(newWord);
        // }
        // }
    }

    public static String Average() {
        // Write a method to remove a given character from a string. E.g. remove all
        // 'Aa' from Average should return verge (core logic only, no .replace or
        // .replaceAll create main method
        // What variables are there
        String word = "Average";
        char letter = 'a';
        char letterUpperCase = 'A';
        char[] wordAsChar = word.toCharArray();
        // I need a String newWord to contain "verg"
        String newWord = "";
        // I need a for loop to go through each character
        for (int i = 0; i < wordAsChar.length; i++) {
            // I now need an if statement to identify the characters in the stream and if
            // they are a character in the string move them to String newWord with
            if (wordAsChar[i] != letter && wordAsChar[i] != letterUpperCase) {
                // if it is not i I need to add it to new string
                newWord += wordAsChar[i];
            }

        }
        return newWord;

    }

    // 2. Write a method to remove duplicate characters from a string.
    public static String noDupes() {
        // what are the variable first
        String word = "baboon";
        char[] wordAsChar = word.toCharArray();
        String noDupes = "";
        // create a for loop going through each character
        for (int i = 0; i < wordAsChar.length; i++) {
            char charI = wordAsChar[i];
            if (!noDupes.contains(charI + "")) {
                noDupes += charI;
            }
        }
        return noDupes;

    }

    public static void vowelNum() {
        // 3. Write a method to count the number of vowels and consonants in a string.
        // E.g. if the input is Java the result should be 2 vowels and 2 consonants .
        // First, what are the variables
        String input = "MissiSSIpi";
        int vowelNumber = 0;
        int consonant = 0;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        char[] vowelsUpperCase = { 'A', 'E', 'I', 'O', 'U' };
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowelsUpperCase.length; j++) {
                if (input.charAt(i) == vowels[j] || input.charAt(i) == vowelsUpperCase[j]) {
                    vowelNumber++;
                }
            }

        }
        consonant = input.length() - vowelNumber;

        System.out.println("A: " + vowelNumber + " B:" + consonant);

    }

}
