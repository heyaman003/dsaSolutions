package cyclicsort;

public class findmissingNumber {
       public static void main(String[] args) {
              int [] arr={3,1,7};
              int i=0;
              while(i<arr.length){
                if(arr[i]<arr.length && arr[i]!=arr[arr[i]]){
                   int temp=arr[arr[i]];
                   arr[arr[i]]=arr[i];
                   arr[i]=temp;
                }
             else
                       i++;
             
              }
              for(i=0;i<arr.length;i++){
                  if(i!=arr[i]){
                      System.out.println(i);
                  return;
                  }
                 
              }
              System.out.println(arr.length); 
       }
      
}
