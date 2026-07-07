class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>hm = new HashMap<>();
        int low=0,res=0,i=0;
        int k = i-low+1;
        for(;i<s.length();i++){
            char curr = s.charAt(i);
            hm.put(curr,hm.getOrDefault(curr,0)+1);

            while(hm.get(curr)>k){
                char rm = s.charAt(low);
                hm.put(rm,hm.getOrDefault(rm,0)-1);

                if(hm.get(rm)==0){
                    hm.remove(rm);
                }
                low++;
            }
            res = Math.max(res,i-low+1);

        }
        return res;
        
    }
}