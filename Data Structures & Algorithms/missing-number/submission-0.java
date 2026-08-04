class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int x_or = n;
        for(int i=0;i<n;i++){
            x_or ^= i^nums[i];
        }
        return x_or;
    }
}
