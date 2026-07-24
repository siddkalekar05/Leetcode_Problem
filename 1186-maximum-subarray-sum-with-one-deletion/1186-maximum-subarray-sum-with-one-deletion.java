class Solution {
    public int maximumSum(int[] arr) {
        int nod = arr[0];
        int del = 0;
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            del = Math.max(del+arr[i],nod);
            nod = Math.max(arr[i],nod+arr[i]);
            ans = Math.max(ans,Math.max(del,nod));
        }
        return ans;
    }
}