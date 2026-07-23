class Solution {
    public int sumOfUnique(int[] nums) {
       int arr[] = new int[101];
       for(int num:nums){
        arr[num]++;
       } 
       int sum = 0;
       for(int a:nums){
        if(arr[a]==1){
            sum+=a;
        }
       }
       return sum;
    }
}