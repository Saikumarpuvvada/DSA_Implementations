package Array;
import java.util.*;

public class Rotate {
    public static void main(String[] args) {
        int k=4;
        int[] arr={1,2,3,4,5,6,7,8,9,10};
         rotate(arr,k);
       
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int[] arr,int s,int e){
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
    public static void rotate(int[] arr,int k){
         rev(arr,0,arr.length-1);
        rev(arr,0,k-1);
        rev(arr,k,arr.length-1);
    }
}
