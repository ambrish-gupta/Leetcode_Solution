class Solution {
    public boolean judgeCircle(String moves) {
        int L = 0;
        int R = 0;
        int U = 0;
        int D = 0;
        for(int i = 0 ; i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch == 'L'){
                L++;
            }else if(ch == 'R'){
                R++;
            }else if(ch == 'U'){
                U++;
            }else if(ch == 'D'){
                D++;
            }         
        }
        if(L==R && U==D){
            return true;
        }else{
            return false;
        }
    }
}