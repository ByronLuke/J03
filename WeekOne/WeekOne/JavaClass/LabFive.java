package WeekOne.JavaClass;

public class LabFive {
    public static void main(String[] args) {
        // 1. Write a method to count the number of occurrences of the letter ‘a’ in a
        // char array?
        // 2. Write a method to remove all white spaces from a char array?
        // 3. Write a method to find duplicate characters in a char array?
        // 4. Write a method to display the words in reverse order.  “How are you”
        // should be displayed “you are How”

        System.out.println(whiteSpaces("How are you?"));
       
    }

    public static int occurrences(String word, char letter) {
        char[] wordAsChar = word.toCharArray();
        int count = 0;
        for (int i = 0; i < wordAsChar.length; i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static String whiteSpaces(String input){
       String newInput = "";
       char[] inputAsChar = input.toCharArray();
       for (int i = 0; i < inputAsChar.length; i++) {
            if(input.charAt(i)!= ' '){
                newInput+=inputAsChar[i]; 
            }
       }
    return newInput;

    }
    public static void duplicateChars(){
        String string = "Hello";
        String newString = string;
        char[] stringAsChar = string.toCharArray();
        for (int i = 0; i < stringAsChar.length-1; i++) {
            for (int j = i+1; j < stringAsChar.length; j++) {
                if(string.charAt(i)== string.charAt(j)){
                     newString = newString.replaceAll(Character.toString(string.charAt(i)), "");
                }
            }
            
            }
            System.out.println(newString);
        }
    public static void reverseOrder(){
        String phrase = "Hello how are you";
        String[] phraseSplit= phrase.split(" ");
        for (int i = phraseSplit.length-1; i>=0 ; i--) {
            System.out.print(phraseSplit[i] + " ");
            }
        }
        }
        

