package WeekOne.JavaClass;

public class LabOne {
    public static void main(String[] args) {
    maxThree(22.3, 33, 87);
    minThree(33, 44, 88);
    midThree(11, 22, 33);
    System.out.println(xor(true, true));
    System.out.println(isFactor(2, 78));
    System.out.println(isPerfect(8128));
    System.out.println(isPrime(8));
    }
    //Write a method called "max3" that finds the largest of THREE integers
    public static void maxThree(double num1, double num2, double num3) {
      System.out.println(Math.max(num1, Math.max(num2, num3)));
    }
    //Write a method called "min3" that finds the smallest of THREE Integers.
    public static void minThree(double min1, double min2, double min3) {
      System.out.println(Math.min(min1, Math.min(min2, min3)));
    }   
    //Write a method called "middle3" that computes the MIDDLE value of THREE 
    //integers. Hint: for the case of three numbers, the middle is the value 
    //that is NOT the maximum NOR the minimum, so add the three values and subtract 
    //out the min and max, using the methods you wrote for problems #1 and #2.
    public static void midThree(double mid1, double mid2, double mid3) {
        
    }
    //Write a method called "xor" that takes two boolean values (either true or false) 
    //and returns a boolean value which is true if EITHER of the values is true BUT NOT 
    //BOTH of them. This is called the "xor" function, or "eXclusive OR" (where we are 
    //excluding the case where both values are true).
public static boolean xor(boolean xor1, boolean xor2) {
    boolean result;
    if (xor1 == true && xor2 == true){
        result = false;
    }
    else if (xor1 == true || xor2 == true){
        result = true;
    }
    else {
        result = false;
    }    
    return result;
}
//Write a method "isFactor" which takes two integers (k and n) and returns true if 
//("if and only if") k is a factor of n. **
public static boolean isFactor(int k, int n) {
    boolean factor;
    if (n % k == 0){
    factor = true;
    }
    else{
    factor = false;
    }
    return factor;

}
//Write a method "isPerfect" which takes an integer and returns true if that integer 
//is a perfect number Your method MUST call the "isFactor" method you wrote for problem #5.**
public static boolean isPerfect(int numP) {
   Boolean perfect = true;
   int sum=0;
    if (numP < 0){
    perfect = false;
   }
   for (int i=1; i<numP; i++) {
       if(isFactor(i, numP)){
        sum = sum+i;
       }
       if (sum==numP){
        perfect=true;
       }
       else{
        perfect=false;
       }
   }
    return perfect;
}
//Write a method "isPrime" which takes an integer and returns true if it is a prime number. 
//Your method MUST call the "isFactor" method you wrote for problem #5.
 public static boolean isPrime(int primeNum) {
    int i=0;
    boolean value=true;
    for (i=2; i<primeNum; i++){
        if (isFactor(i, primeNum)){
            value=false;
        }
        else{
            value=true;
        }
}
    return value;
}
//iFactor integration
}