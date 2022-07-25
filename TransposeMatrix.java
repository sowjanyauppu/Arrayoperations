/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {
  public static void main(String args[])
  {
//Declare the variables
    int n,m,i,j;
//Take input from user to enter rows and column values
    Scanner sc=new Scanner(System.in);
    System.out.println("enter rows: ");
    n=sc.nextInt();
    System.out.println("enter columns: ");
    m=sc.nextInt();
    int matrix[][]=new int[n][m];
    for(i=0;i<n;i++)
      {
        for(j=0;j<m;j++)
          {
            System.out.println("Elements  ["+(i+1)+","+(j+1)+"] : ");
            matrix[i][j]=sc.nextInt();
          }
      }
    System.out.println("matrix");
    for(i=0;i<n;i++){
      for(j=0;j<m;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println(" ");
    }
    
//Convert the square matrix into transpose
   System.out.println("transpose matrix"); 
    for(i=0;i<n;i++){
      for(j=0;j<m;j++){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
          matrix[j][i]=temp;
      }
    }
//Print the transpose matrix
//printing j and i instead of i and j
    
    for(i=0;i<n;i++){
      for(j=0;j<m;j++){
        System.out.print(matrix[j][i]+" ");
      }
      System.out.println(" ");
    }

}


}