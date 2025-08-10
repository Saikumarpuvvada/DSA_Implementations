package DSA_Implementations.Sorting;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr={3,6,1,2,11,4};
        int n=arr.length;
       for(int i=n-1;i>=0;i--){
        for(int j=0;j<i;j++){
            if(arr[j]>arr[j+1]){
                int t=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=t;
            }
        }
       }
        System.out.println(Arrays.toString(arr));
    }
}
