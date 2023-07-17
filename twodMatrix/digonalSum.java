package twodMatrix;

import java.util.Scanner;

public class digonalSum {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.print("enetr row no :  ");
              int m = sc.nextInt();
              System.out.println();
              System.out.print("enetr column no : ");
              int n = sc.nextInt();
              System.out.println();
              int matrrix[][] = new int[m][n];
              for (int i = 0; i < matrrix.length; i++) {
                     for (int j = 0; j < matrrix[i].length; j++) {
                            matrrix[i][j] = sc.nextInt();
                     }
              }
              System.out.println("the sum is " +FindSum(matrrix));
              System.out.println("the sum is " +OptmizeSum(matrrix));
       }

       static int FindSum(int arr[][]) {
              int sum=0;
              for (int i = 0; i < arr.length; i++) {
                     for (int j = 0; j < arr[i].length; j++) {
                            if(i==j){
                                 sum +=arr[i][j];
                            }
                            else if(i+j==(arr.length-1)){
                               sum +=arr[i][j];
                            }
                     }
              }
              return sum;
       }
       static int OptmizeSum(int arr[][]){
               int sum=0;
             int n=arr.length-1;
              for (int i = 0; i < arr.length; i++) {
                    sum=sum+arr[i][i];
                    if(i!=n-i)
                    sum=sum+arr[i][n-i];
                    
              }
              return sum;
             
       }

}
