


import java.util.*;

public class median {
    public static void main(String[] args) {
        int a[]={-3,4,10};
        int b[]={-1,5,12};
        int c= a.length+b.length;
        int temp[]= new int [c];
        int indx=0;
        for(int i=0;i<a.length;i++)
        {
temp[indx++]=a[i];
        }
        for(int j=0;j<b.length;j++)
        {
            temp[indx++]=b[j];
        }
        Arrays.sort(temp);
       double med;
        // System.out.println(temp.length);
        // for(int i=0;i<temp.length;i++)
        // {
        //     System.out.println(temp[i]);
        // }
        
        if(indx%2==1)
        {
med=(double)temp[(indx/2)];
System.out.println(med);
        }
        else
        {
            int term1=temp[indx/2];
            int term2=temp[indx/2-1];
            System.out.println((double)(term1+term2)/2.0);
        }
    }
}
