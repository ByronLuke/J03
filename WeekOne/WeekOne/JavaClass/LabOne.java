package WeekOne.JavaClass;

public class LabOne {
    public static void main(String[] args) {
    System.out.println(max3(22.3, 33, 87));
    System.out.println(min3(33, 44, 88));
    System.out.println(middle3(11, 22, 33));
    System.out.println(xor(true, true));
    System.out.println(isFactor(2, 78));
    System.out.println(isPerfect(8128));
    System.out.println(isPrime(8));
    }
    //Write a method called "max3" that finds the largest of THREE integers
    public static double max3(double num1, double num2, double num3) {
        double max=0;
        if (num1>num2 && num1>num3){
            max=num1;
        }
        else if (num2 > num3 && num2>num3){
            max=num2;
        }
        else if (num3 > num1 && num3 > num2){
            max=num3;
        }
        return max;
    }
    //Write a method called "min3" that finds the smallest of THREE Integers.
    public static double min3(double num1, double num2, double num3) {
        double min= 0;
        if (num1<num2 && num1<num3){
            min=num1;
        }
        else if(num2<num1 && num2<num3){
            min=num2;
        }
        else if(num3<num1 && num3<num2){
            min=num3;
        }
        return min;    
    }
    //Write a method called "middle3" that computes the MIDDLE value of THREE 
    //integers. Hint: for the case of three numbers, the middle is the value 
    //that is NOT the maximum NOR the minimum, so add the three values and subtract 
    //out the min and max, using the methods you wrote for problems #1 and #2.
    public static double middle3(double num1, double num2, double num3) {
        double maxNum= max3(num1, num2, num3);
        double minNum= min3(num1, num2, num3);
        double middle= (num1+num2+num3)-(maxNum+minNum);
        return middle;
    }
    //Write a method called "xor" that takes two boolean values (either true or false) 
    //and returns a boolean value which is true if EITHER of the values is true BUT NOT 
    //BOTH of them. This is called the "xor" function, or "eXclusive OR" (where we are 
    //excluding the case where both values are true).
    public static boolean xor(boolean xor1, boolean xor2) {
        boolean xorResult;
        if(xor1==true && xor2==false){
            xorResult = true;
        }
        else if(xor1==false & xor2==true) {
            xorResult = true;
        }
        else{
            xorResult = false;
        }
        
        return xorResult;
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
    for (int i=2; i<primeNum; i++){
        if (isFactor(i, primeNum)){
            return false;
        }
      
}
    return true;
 }
}
