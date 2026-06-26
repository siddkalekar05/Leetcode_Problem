class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0;
        int windowsum = 0;
        for(int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        maxAvg = (double)windowsum/k;
        for(int i=k;i<nums.length;i++){
            double avg = 0;
            windowsum+=nums[i];
            windowsum-=nums[i-k];
            avg = (double)windowsum/k;
            maxAvg = Math.max(maxAvg,avg);

        }
        return maxAvg;
        
    }
}