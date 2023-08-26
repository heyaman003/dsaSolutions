package recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class MazeProblem {
       public static void main(String[] args) {
              int arr[][]=new int [3][3];
              System.out.println(RecursiveApproach(arr.length, arr[0].length));
              System.out.println(RecursiveApproach2(arr.length, arr[0].length,""));
               RecursiveApproach3(arr.length, arr[0].length,"");
               RecursiveApproach4(arr.length, arr[0].length,"");
               RecursiveApproachRestiction(arr.length, arr[0].length,"", 2, 2);
       }
       static int RecursiveApproach(int row,int col){
              if(row==1||col==1){
                  return 1;
              }
               int left=RecursiveApproach( row-1, col);
               int rigth=RecursiveApproach( row, col-1);
               int dig=RecursiveApproach(row-1, col-1);
               return left+rigth+dig;
       }
       static List<String> RecursiveApproach2(int row,int col,String s){
              if (row == 1 && col == 1) {
                     List<String> list = new ArrayList<>();
                     list.add(s);
                     return list;
                 }
         
                 List<String> paths = new ArrayList<>();
                 if (row > 1) {
                     paths.addAll(RecursiveApproach2(row - 1, col, s + "D"));
                 }
                 if (col > 1) {
                     paths.addAll(RecursiveApproach2(row, col - 1, s + "R"));
                 }
         
                 return paths;
       }
       static void RecursiveApproach3(int row,int col,String s){
              if (row == 1 && col == 1) {
                    System.out.println(s);
                 }
                 if(row>1){
                     RecursiveApproach3(row-1, col, s+"D");
                 }
                 if(col>1){
                     RecursiveApproach3(row, col-1, s+"R");
                 }
             
       }
       static void RecursiveApproach4(int row,int col,String s){
              if (row == 1 && col == 1) {
                    System.out.println(s);
                 }
                 if(row>1){
                     RecursiveApproach3(row-1, col, s+"D");
                 }
                 if(col>1){
                     RecursiveApproach3(row, col-1, s+"R");
                 }
                 if(row>1&&col>1){
                     RecursiveApproach4(row-1, col-1, s+"M");
                 }
             
       }
         static void RecursiveApproachRestiction(int row,int col,String s,int Rrow,int Rcol){
              if (row == 1 && col == 1) {
                    System.out.println(s);
                 }
                 if(row==Rrow&&col==Rcol)
                 return;
                 if(row>1){
                      RecursiveApproachRestiction(row-1, col, s+"D",Rrow,Rcol);
                 }
                 if(col>1){
                     RecursiveApproachRestiction(row, col-1, s+"R",Rrow,Rcol);
                 }
             
       }
}
