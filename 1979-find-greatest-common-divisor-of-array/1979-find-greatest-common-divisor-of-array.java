class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for(int i = 1; i<=nums[0];i++){
            int sum = 0;
            if(nums[0]%i==0 && nums[n-1]%i == 0){
                
                ans = i;
            }
        }
        return ans;
    }
}