package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n=arr.length;
        int SubSets=1<<n;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<SubSets;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))>0){
                    list.add(arr[j]);
                }
            }
            ans.add(list);
        }
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
