package DSA_Implementations.Sorting;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,5};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        int i=0;
        while(i<arr.length-1){
            int crt=arr[i]-1;
            if(arr[i]!=arr[crt]){
                int temp=arr[i];
                arr[i]=arr[crt];
                arr[crt]=temp;
            }else{
                i++;
            }
        }
        return arr;
    } 
}
