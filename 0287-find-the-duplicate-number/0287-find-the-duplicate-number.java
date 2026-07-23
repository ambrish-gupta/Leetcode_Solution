class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length];
        int k =0;
        for(int a:nums){
            if(arr[a]>=1){
                k = a;
                return a;
                
            }
            arr[a]++;
        }
        return k;
    }
}