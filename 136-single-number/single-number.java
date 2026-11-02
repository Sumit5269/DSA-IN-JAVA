class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int val=0; val<nums.length;val++){
            ans=ans^nums[val];
        }
        return ans;
    }
}