package DSA_Implementations.Sorting;

import java.util.Arrays;
import java.util.ArrayList;

public class Merge {
    public static void main(String[] args) {
        int[] arr={1,7,3,6,3,2,5,8};
        ms(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void ms(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=low+(high-low)/2;
        ms(arr, low, mid);
        ms(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int l=low,r=mid+1;
        while(l<=mid && r<=high){
            if(arr[l]<=arr[r]){
                temp.add(arr[l++]);
            }else{
                temp.add(arr[r++]);
            }
        }
        while(l<=mid){
            temp.add(arr[l++]);
        }
        while(r<=high){
            temp.add(arr[r++]);
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
}
