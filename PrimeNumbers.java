/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class PrimeNumbers {

//Add main method here
public static void main (String[] args)
    {
          //Declare variables num1, num2, i, count and initialize count as zero
     int i,j,num1,num2,count=0;
      num1 = 0;
      num2 = 0;
//Use the scanner class 
Scanner sc = new Scanner(System.in);
 // Take start value as input and read using scanner object

 System.out.print("Enter Starting Number : ");
        int start = sc.nextInt();
//Take end value as an input and read using scanner object

        System.out.print("Enter Ending Number : ");
        int end = sc.nextInt();
//check for all the integer numbers which is between the two numbers given and using for loop
      System.out.println("Prime numbers between "+start+" and "+end+" are : ");
        for(i=start; i<=end; i++)
 {
            count = 0;
            //skipping o & 1, since they aren"t primes
            if(i == 1||i == 0) {
                continue;
            }
            for(j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
              //printing prime numbers between the given numbers
                System.out.println(i + " ");
            }
        }
    }

     
}