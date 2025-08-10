package DSA_Implementations.Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={6,2,0,1,4,5};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                }
                if(arr[i]>arr[min]){
                    int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
            }
        }
        return arr;
    }
}
