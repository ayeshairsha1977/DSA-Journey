

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> anset=new HashSet<>();
        for(int i:nums1)set.add(i);
        for(int i:nums2){
            if(set.contains(i)){
                anset.add(i);
            }
        }
        int[] arr=new int[anset.size()];
        int i=0;
        for(Integer ele: anset)arr[i++]=ele;
        return arr;
    }
}
