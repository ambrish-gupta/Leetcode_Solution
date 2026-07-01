class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> zeros = new ArrayList<>();
                ArrayList<Integer> ones = new ArrayList<>();
        ArrayList<Integer> twos = new ArrayList<>();
        int n = nums.length;
    for(int i = 0 ; i<n;i++){
        if(nums[i]==0){
            zeros.add(nums[i]);
        }else if(nums[i]==1){
            ones.add(nums[i]);
        }else if(nums[i]==2){
            twos.add(nums[i]);
        }
    }
    int k=0;
    for(int i = 0; i<zeros.size();i++){
        nums[k] = zeros.get(i);
        k++;
}   for(int i = 0; i<ones.size();i++){
        nums[k] = ones.get(i);
        k++;
}   for(int i = 0; i<twos.size();i++){
        nums[k] = twos.get(i);
        k++;
}
    }
}