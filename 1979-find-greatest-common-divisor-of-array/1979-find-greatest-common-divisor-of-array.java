class Solution {
    public int gcd(int a ,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         for(int val:nums){
            min = Math.min(val,min);
            max = Math.max(val,max);
         }
         return gcd(max,min);
    }
}