class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int a = s.length();
        int b = t.length();
        for(int j = 0;j<b && i<a;j++){
            if(s.charAt(i)==t.charAt(j)){
                    i++;
            }
        }
        return i == s.length();
    }
}