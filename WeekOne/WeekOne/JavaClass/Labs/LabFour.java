package WeekOne.JavaClass.Labs;

class LabFour {

    public static void main(String[] args) {
        System.out.println(sumLimit(8, 1));
        System.out.println(paloAlto(95, false));
        System.out.println(lotteryTicket(2, 2, 1));
        System.out.println(countXX("xxx", 'x'));
        System.out.println(copyWord("Hi", 3));
    }

    // Given 2 non-negative ints, a and b, return their sum, so long as the sum has
    // the same number of digits as a. If the sum has more digits than a, just
    // return a without b. 
    public static int sumLimit(int a, int b) {
        String integerA = String.valueOf(a);
        String sumOfBandA = String.valueOf(a + b);
        int result = 0;

        if (integerA.length() == sumOfBandA.length()) {
            result = a + b;
        } else if (sumOfBandA.length() > integerA.length()) {
            result = a;
        }

        return result;
    }

    // The squirrels in Palo Alto spend most of the day playing. In particular, they
    // play if the temperature is between 60 and 90 (inclusive). Unless it is
    // summer, then the upper limit is 100 instead of 90. Given an int temperature
    // and a boolean isSummer, return true if the squirrels play and false
    // otherwise.
    public static boolean paloAlto(double temp, boolean isSummer) {
        int upperLimit = 90;
        boolean result = true;

        if (isSummer) {
            upperLimit = 100;
        }
        if (temp >= 60 && temp < upperLimit) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    // You have a green lottery ticket, with ints a, b, and c on it. If the numbers
    // are all different from each other, the result is 0. If all of the numbers are
    // the same, the result is 20. If two of the numbers are the same, the result is
    // 10.
    public static int lotteryTicket(int a, int b, int c) {
        int result = 0;
        if (a == b && b == c) {
            result = 20;
        } else if (a == b || b == c) {
            result = 10;
        }
        return result;

    }

    // Count the number of "xx" in the given string. We'll say that overlapping is
    // allowed, so "xxx" contains 2 "xx".
    // if last charcater is x and current charcater is x, increment the count
    /*
     * Test cases
     * countXX("abcxx") → 1
     * countXX("xxx") → 2
     * countXX("xxxx") → 3
     */
    public static int countXX(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == letter && word.charAt(i + 1) == letter) {
                count++;
            }

        }
        return count;

    }

    // Given a string and a non-negative int n, return a larger string that is n
    // copies of the original string.
    /*
     * Test cases
     * stringTimes("Hi", 2) → "HiHi"
     * stringTimes("Hi", 3) → "HiHiHi"
     * stringTimes("Hi", 1) → "Hi"
     */

    public static String copyWord(String originalWord, int n) {
        String copyWord = "";
        for (int i = 0; i < n; i++) {
            copyWord += originalWord;

            // *Faster way = return originalWord.repeat(n);
        }
        return copyWord;
    }
}
