class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,most=0,len=0,res=0;
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch-'A']++;
            most = Math.max(most,arr[ch-'A']);

            len = i-left+1;
            int diff = len-most;
            while(diff>k){
                char rm = s.charAt(left);
                arr[rm-'A']--;
                left++;
                len = i-left+1;
                diff = len-most;
            }
            res = Math.max(res,len);
        }
        return res;  
    }
}