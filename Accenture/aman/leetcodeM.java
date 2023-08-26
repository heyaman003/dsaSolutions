package Accenture.aman;

public class leetcodeM {


    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        int[] ans = new int[2];
        int start =0;
        int target =5;
        int end = arr.length-1;
        while(start< end){
            
            if(arr[start]+arr[end]<target){
                start = start+1;
            }
            else if(arr[start]+arr[end]>target){
                end = end-1;
            }
            else{
              ans[0]=start;
              ans[1]=end;
            break;
            }
        }
        System.out.println(start+""+end);
    }

}
