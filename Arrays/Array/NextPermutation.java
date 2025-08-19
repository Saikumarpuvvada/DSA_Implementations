package Array;
import java.lang.reflect.Array;
import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        NextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void NextPermutation(int[] arr){
        int bp=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                bp=i-1;
                break;
            }
        }
        if(bp==-1){
             rev(arr,0,arr.length-1);
             return;
        }

        for(int i=arr.length-1;i>bp;i--){
            if(arr[i]>arr[bp]){
                swap(arr,i,bp);
                rev(arr,bp+1,arr.length-1);
            }
        }
    }
    static void swap(int[] arr,int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    static void rev(int[] arr,int s,int e){
        while(s<=e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
}
