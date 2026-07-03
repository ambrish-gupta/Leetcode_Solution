class Solution {
    public int search(int[] nums, int target) {
      
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int k = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                k = mid;
                break;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return k;
    }
}