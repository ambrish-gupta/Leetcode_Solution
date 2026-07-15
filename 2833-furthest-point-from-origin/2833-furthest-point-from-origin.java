class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int L = 0;
        int R = 0;
        int a = 0;
        for(int i = 0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch=='L'){
                L++;
            }else if(ch == 'R'){
                R++;
            }else{
                a++;
            }
        }
        int k = Math.abs(L-R);
        int res = k+a;
        return res;
    }
}