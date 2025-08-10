package Array;

import java.util.Arrays;

class ZeroEnd {
    public static void main(String[] args) {
        int[] arr={0,0,0,1,2,3,4,5,9,0,77,7,7,7,7,0,0,7,9,0,0,7,55,4,3,7,0};
        pushZerosToEnd(arr);
        
        System.out.println(Arrays.toString(arr));

    }
    public static void pushZerosToEnd(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                j++;
            }
        }
    }
}
