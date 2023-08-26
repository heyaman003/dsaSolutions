package maxsumOfsubarray;

public class brutforce {
       public static void main(String[] args) {
        int arr[] = {-5, 4, 6, -3, 4,-1};
        System.out.println(returnBrut(arr));
    }

    static int returnBrut(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp = temp + arr[j];
                if (temp > maxsum)
                    maxsum = temp;
            }
        }
        return maxsum;
    }
}