package Accenture.prepInsta;

public class equlibriumIndex {
       public static void main(String[] args) {
              int arr[]={ 3,4,5,7,3,4,5,6 };
              System.out.println(finfEqb(arr));
       }
       static int finfEqb(int arr[]){
              int start=0;
              int end=arr.length-1;
              int sum1=0;
              int sum2=0;
              while (start<=end) {
                  sum1=sum1+arr[start];  
                  sum2=sum2+arr[end];  
                  
              }
              return -1;
       }
}
