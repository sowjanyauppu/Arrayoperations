/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {
  public static void main(String args[])
  {
//Declare the variables
    int n,m,i,j;
//Take number of rows and columns from user in two-dimensional array
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of rows");
    n=sc.nextInt();
    System.out.println("enter number of column");
    m=sc.nextInt();
    int[][]  arr=new int[n][m];
      for(i=0;i<n;i++)
      {
        for(j=0;j<m;j++)
          {
            System.out.print("Elements  ["+i+"]"+j+"] : ");
            arr[i][j]=sc.nextInt();
          }
        System.out.println(" ");
      }
//assume first element is largest and use for loop to compare the largest element with all the reamaining elements
    int larg=arr[0][0],posi=0,posj=0;
    for(i=0;i<n;i++)
      {
        for(j=0;j<m;j++)
          {
            if(larg<arr[i][j]){
              larg=arr[i][j];
//Calcualte the maximum element based on index poistion
               posi=i;
              posj=j;
            }
          }
      }
    
//Print result
    System.out.println("Largest element in array is "+larg+ " and its index position is arr["+posi+"]["+posj+"]");
}

}