class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = max;
            int val1 = nums[i];
            max = Math.max(val1,Math.max(min*nums[i] , temp*nums[i]));
            min = Math.min(val1,Math.min(temp*nums[i],min*nums[i]));
            res = Math.max(res,Math.max(max,min));
        }
        return res;
    }
}