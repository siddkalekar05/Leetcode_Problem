class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
       int result[] = new int[n];
       int left = 0;
       int right = nums.length-1;
       int idx = result.length-1;
       while(left<=right){
        int l = nums[left]*nums[left];
        int r = nums[right]*nums[right];

        if(l>r){
            result[idx]=l;
            left++;
        }else{
            result[idx]=r;
            right--;
        }
        idx--;
       }
       return result;
        
    }
}