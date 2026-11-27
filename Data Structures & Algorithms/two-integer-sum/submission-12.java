class Solution {
    public int[] twoSum(int[] nums, int target) {
        //[2,5,5,11], target = 10

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length && i != j; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
