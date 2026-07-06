import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> hm = new HashMap<>();
        int left = 0;
        int res = 0;
        for(int r = 0;r<fruits.length;r++){
            int l = fruits[r];
            hm.put(l, hm.getOrDefault(l,0)+1);

            while(hm.size()>2){
                int leftFruit = fruits[left];
                hm.put(leftFruit, hm.getOrDefault(leftFruit,0)-1);
                if(hm.get(leftFruit)==0){
                    hm.remove(leftFruit);
                }
                left++;
            }
            res = Math.max(res, r-left+1);
            
        }
        return res;
    }
}