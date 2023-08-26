package heyStrings;

import java.util.Arrays;

public class streetLight {
       public static void main(String[] args) {
            int arr[]={1,1,1,0,1,1,1,1};  
            toggle(arr,2); 
       }
       static void toggle(int arr[],int k){
              int arr1[]=new int[10];
              for (int i = 1; i < arr1.length-1; i++) {
                   arr1[i]=arr[i-1];  
              }

              System.out.println(Arrays.toString(arr1));
              for(int i=0;i<2;i++){
                     for(int j=1;j<arr.length-1;j++){
                        if(j==1)
                        arr[j]=(0^arr[j-1]);
                        else if(i==arr.length-1)
                        arr[j]=(0^arr[j+1]);
                        else arr[j]=arr[j-1]^arr[j+1];    
                     }
              }
              System.out.println(Arrays.toString(arr));
       }
      

}
