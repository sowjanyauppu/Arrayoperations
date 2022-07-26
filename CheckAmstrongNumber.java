/*43. Write a JAVA program to check whether a number is Armstrong number or not.
In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself. For example:

153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number. */

import java.util.Scanner;
public class CheckAmstrongNumber {

    public static void main(String[] args) {

      int number , originalNumber, remainder, result = 0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to check:");
        number=sc.nextInt();

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}