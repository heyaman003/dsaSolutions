package hashmapInJava.Sardhaquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityCount {
       public static void main(String[] args) {
              int arr[]={10,12,12,10,12,19,28,10,21,10};
              int n=arr.length/3;
              System.out.println(majority(arr, n));
              System.out.println(majority2(arr, n));

       }
       static List<Integer> majority(int arr[],int n){
       List<Integer> list=new ArrayList<>();
       HashMap<Integer,Integer> map=new HashMap<>();
             for (int i : arr) {
              /* if(map.containsKey(i)){
                     map.put(i,map.get(i)+1);
              }
              else{
                     map.put(i, 1);
              } */
              map.put(i,map.getOrDefault(i, 0)+1);
             } 
             for (int key : map.keySet()) {
                if(map.get(key)>=n)
                list.add(key);
             }
     
             return list; 
       }
       static List<Integer> majority2(int arr[],int n){
       List<Integer> list=new ArrayList<>();
       HashMap<Integer,Integer> map=new HashMap<>();
             for (int i : arr) {
              /* if(map.containsKey(i)){
                     map.put(i,map.get(i)+1);
              }
              else{
                     map.put(i, 1);
              } */
              map.put(i,map.getOrDefault(i, 0)+1);
             } 
             for (int key : map.keySet()) {
                if(map.get(key)>=n)
                list.add(map.get(key));
             }
     
             return list; 
       }
}
