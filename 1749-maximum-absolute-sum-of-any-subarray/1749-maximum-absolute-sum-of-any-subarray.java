class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum = nums[0];
        int minsum = nums[0];
        int maxval = 0;
        int minval = 0;
        int ans = Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            maxsum = Math.max(nums[i],maxsum+nums[i]);
            maxval = Math.max(maxval,maxsum);

            minsum = Math.min(nums[i],minsum+nums[i]);
            minval = Math.min(minval,minsum);
            ans = Math.max(ans,Math.max(Math.abs(maxsum),Math.abs(minsum)));
        }
        return ans;
        
    }
}