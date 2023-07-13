package twodMatrix;

import java.util.Scanner;

public class Spiralmatrix {
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
              Spiral(matrrix);
       }

       public static void Spiral(int matrrix[][]) {
              int startRow = 0;
              int startColmn = 0;
              int endRow = matrrix.length - 1;
              int endColmn = matrrix[0].length - 1;
              while (startColmn <= endColmn && startRow <= endRow) {
                     for (int i = startColmn; i <= endColmn; i++) {
                            if (startRow == endRow)
                                   break;
                            System.out.print(matrrix[startRow][i]);
                     }
                     for (int i = startRow + 1; i <= endRow; i++) {
                            if (startColmn == endColmn)
                                   break;
                            System.out.print(matrrix[i][endColmn]);
                     }
                     for (int i = endColmn - 1; i >= startColmn; i--) {
                            System.out.print(matrrix[endRow][i]);
                     }
                     for (int i = endRow - 1; i >= startRow + 1; i--) {
                            System.out.print(matrrix[i][startColmn]);
                     }
                     startRow++;
                     startColmn++;
                     endRow--;
                     endColmn--;
              }

       }
}