public class arrayNegibour {
       public static void main(String[] args) {
              int arr[]={2,3,4,1,5,6,7};
              int count =0;
              for (int i = 0; i < arr.length; i++) {
                     count++;
                     if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                            System.out.println(i+" ,"+arr[i]);
                            return;
                     }


              }
       }
}
