package cyclicsort;

import java.util.Arrays;

public class algoCyclic {
       public static void main(String[] args) {
              int arr[]={3,5,2,4,6,1};
              
              cyclicsort(arr);
              System.out.println(Arrays.toString(arr));

       }
       static void cyclicsort(int arr[]){
              int i=0;
            while(i<arr.length){
              int correctIndex=arr[i]-1;
              if(arr[correctIndex]!=arr[i]){
                 int temp=arr[correctIndex];
                 arr[correctIndex]=arr[i];
                 arr[i]=temp;
              }
           else
                     i++;
           
            }
       }
}
