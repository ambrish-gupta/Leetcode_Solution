class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = 0;
        int ele2 = 0;
        int n = nums.length;
        for(int i = 0 ; i<n;i++){
            if(cnt1 == 0 && ele2 != nums[i]){
                cnt1 = 1;
                ele1 = nums[i];
            }else if(cnt2 == 0 && ele1 != nums[i]){
                cnt2 = 1; 
                ele2 = nums[i];
            }else if(ele1==nums[i])cnt1++;
            else if(ele2==nums[i])cnt2++;
            else{
                cnt1--;cnt2--;
            }
        }

        int ncnt1 = 0; int ncnt2 = 0;
        for(int i = 0 ; i<n; i++){
            if(ele1==nums[i])ncnt1++;
            if(ele2 == nums[i])ncnt2++;
        }
        if(ncnt1>n/3){
            res.add(ele1);
        }if(ncnt2>n/3 && ele2 != ele1){
            res.add(ele2);
        }
        return res;
    }
}