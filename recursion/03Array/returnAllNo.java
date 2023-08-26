import java.util.ArrayList;

public class returnAllNo {
     public static void main(String[] args) {
       int arr[]={10,40,12,34,56,34,67};
       //System.out.println(myNormalFunc(arr, 34));
       //ArrayList<Integer> list=new ArrayList<>();
       //System.out.println(recursiveapp(arr, list, 34, 0));
       System.out.println(recursiveapp2(arr, 34, 0));
     }  
     static ArrayList<Integer> myNormalFunc(int arr[],int target){
       ArrayList<Integer> list=new ArrayList<>();
       int count=0;
       for (int i : arr) {
             if(i==target)
              list.add(count);
              count++;
       }
       return list;
     }
     static ArrayList<Integer> recursiveapp(int arr[],ArrayList<Integer> list,int target,int index){
         if(index==arr.length-1)
         return list;
         if(arr[index]==target)
         list.add(index);
         return recursiveapp(arr, list, target, index+1);
     }
     static ArrayList<Integer> recursiveapp2(int arr[],int target,int index){
       ArrayList<Integer>list=new ArrayList<>();
         if(index==arr.length-1)
         return list;
         if(arr[index]==target)
         list.add(index);
        ArrayList<Integer>list1=recursiveapp2(arr, target, index+1);
        list.addAll(list1);
        return list;
     }
}
