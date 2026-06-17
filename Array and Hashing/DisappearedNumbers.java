
import java.util.*;
public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int[] fre=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]-1]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(fre[i]==0){
                l.add(i+1);
            }
        }
        return l;
    }
}
