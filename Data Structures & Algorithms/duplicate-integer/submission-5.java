class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> records = new HashMap();

        // [1,2,3,3]
        // 1 -> 1
        // 2 -> 1
        // 3 -> 2

        for(int v : nums){
            records.put(v, 0);
        }

        for(int i = 0; i < nums.length; i++){
            int key = nums[i];
           if(records.containsKey(key)){
            records.compute(key, (kx,v) -> {
                v += 1;
                return v;
            });
           }
        }

        for(Map.Entry<Integer, Integer> v : records.entrySet()){
            if((v.getValue()) > 1) return true;
        }
        return false;
    }
}