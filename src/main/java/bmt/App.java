package bmt;


public class App 
{

        public  static double divide(double num1, double num2) {
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return num1 / num2;
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        
        public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
