class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        int zeroCount = 0;
        int num = 1;
        
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) {
                zeroCount++;
            } else {
                num *= nums[i];
            }
        }

        for(int j = 0; j < n; j++){
            if(zeroCount > 1) {
                ans[j] = 0;
            } else if(zeroCount == 1) {
                ans[j] = (nums[j] == 0) ? num : 0;
            } else {
                ans[j] = num / nums[j];
            }
        }

        return ans;
    }
}