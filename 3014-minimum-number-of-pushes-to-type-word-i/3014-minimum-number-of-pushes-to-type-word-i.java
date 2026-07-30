class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int sum = 0;
        int cnt = 0;
        for(int i = 0 ; i<n ; i++){
            char ch = word.charAt(i);
            cnt++;
            if(cnt<=8){
                sum+=1;
            }else if(cnt>8 && cnt<=16){
                sum+=2;
            }else if(cnt<=24 && cnt>16){
                sum+=3;
            }else{
                sum+=4;
            }
        }
        return sum;
    }
}