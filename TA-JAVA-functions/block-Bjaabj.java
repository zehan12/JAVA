/*
2. Create a function named `fullName` with the following steps:

  - Prompts a message saying `Enter your first name` and store the value into variable named `firstName`
  - Prompts a message saying `Enter your last name` and store the value into variable named `lastName`
  - Concat the value of fistName and lastName and store it in another variable named `fullName`.
  - Alert `fullName`
*/


/*
3. Create a function named `addTwoNumbers` with the following steps:

  - Prompts a message saying `Enter the first number` and store the value into variable named `firstNum`
  - Prompts a message saying `Enter the second` and store the value into variable named `secondNum`
  - Add the value of firstNum and secondNum and store it in another variable named `sum`.
  - Alert `sum`
*/


/*
4. Create a function named `getTable` with the following steps:

  - Prompts a message saying `Enter a number` and store the value into variable named `num`
  - Using `console.log` logs the Multiplication Table of the number entered by the user.
  - Example: Number is 9

  9 * 1 = 9
  9 * 2 = 18
  9 * 3 = 27
  9 * 4 = 36
  9 * 5 = 45
  9 * 6 = 54
  9 * 7 = 63
  9 * 8 = 72
  9 * 9 = 81
  9 * 10 = 90
*/

/*
5. Create a function named `isLeapYear` with the following steps:

  - Prompts a message saying `Enter a year` and store the value into variable named`year`
  - Alert `[year] is a leap year` otherwise `[year] is not a leap year`
*/

/*
6. Create a function named `getFactorial` with the following steps:

  - Prompts a message saying `Enter a number` and store the value into variable named`number`
  - Alert `The factorial of [number] is [factorial]`

*/

public class Main {

    static String fullName(String firstName, String lastName) {
        return firstName + " " +lastName;
    }

    static int addTwoNumbers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    static void getTable(int num) {
        for ( int i = 0 ; i <= 10 ; i++ ) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }

    static boolean isLeapYear(int year) {
        if ( year % 4 == 0 || year % 400 == 0 ) {
            return true;
        } 
        return false;
    }

    static String getFactorial(int num) {
        int factorial = 1;
        for ( int i = 1 ; i <= num ; i++ ) {
            factorial *= i;
        }
        return "The Factorial of " +num+" is "+ factorial+"!";
    }



    public static void main (String args[]) {
        System.out.println(fullName("zehan","khan"));
        System.out.println(addTwoNumbers(10,10));
        getTable(9);
        System.out.println(isLeapYear(1993));
        System.out.println(getFactorial(5));
    }
}
