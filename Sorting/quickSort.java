package DSA_Implementations.Sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr={1,6,4,5,3,6,3,5,4,9,0};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int pi(int[] arr,int low,int high){
        int pivot=low;
        int i=low,j=high;
        while(i<=j){
            while(arr[i]<=arr[pivot] && i<=high){
                i++;
            }
            while(arr[j]>arr[pivot] && j>low){
                j--;
            }
            if(i<j){
            swap(arr,i,j);
            }
        }
        swap(arr,j,pivot);
        return j;

    }
   static void qs(int[] arr,int low,int high){
    if(low>=high) return; 
        int pi=pi(arr, low, high);
        qs(arr, low, pi-1);
        qs(arr, pi+1, high);
    }
    static void swap(int[] arr,int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}
