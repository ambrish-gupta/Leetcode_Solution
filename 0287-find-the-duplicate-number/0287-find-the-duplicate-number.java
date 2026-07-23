class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = 0;
        for(int i = 1; i<n;i++){
            if(nums[i]==nums[i-1]){
                a = nums[i];
            }
        }
        return a;
    }
}