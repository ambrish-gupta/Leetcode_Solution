class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        for(int i = 0 ; i<n; i++){
            res.add(nums1[i]);
        }
        for(int i = 0 ; i<m;i++){
            res.add(nums2[i]);
        }
        Collections.sort(res);
        int len = res.size();
        if(len%2==1){
            return (res.get(len/2));
        }else{
            return (res.get(len/2-1) + res.get(len/2))/2.0;
        }
    }
}