class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0; 
        int high = n-1;
        int k = -1;
        int l = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                
            l = mid;
            high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
            
        }
        low = 0;
        high = n-1;
                while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                
            k = mid;
            low = mid+1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
            
        }
        int[] arr = {l,k};
        return arr;
    }
}