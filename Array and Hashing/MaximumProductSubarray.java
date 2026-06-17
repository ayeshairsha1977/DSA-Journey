public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max_ending=nums[0],max_pro=nums[0];
        for(int i=1;i<nums.length;i++){
            max_ending=Math.max(max_ending*nums[i],nums[i]);
            max_pro=Math.max(max_ending,max_pro);
        }
        return max_pro;
    }
}
