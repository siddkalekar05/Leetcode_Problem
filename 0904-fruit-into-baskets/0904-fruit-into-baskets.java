class Solution {
    public int totalFruit(int[] fruits) {
         Map<Integer,Integer> hm = new HashMap<>();
       int left = 0;
       int res = 0;
       for(int right=0;right<fruits.length;right++){
        int fruit = fruits[right];
        hm.put(fruit, hm.getOrDefault(fruit, 0)+1);

        while(hm.size()>2){
            int remove = fruits[left];
            hm.put(remove, hm.getOrDefault(remove, 0)-1);
            if(hm.get(remove)==0){
                hm.remove(remove);
            }
            left++;
        }
            res = Math.max(res, right-left+1);
        
       }
       return res;
        
    }
}