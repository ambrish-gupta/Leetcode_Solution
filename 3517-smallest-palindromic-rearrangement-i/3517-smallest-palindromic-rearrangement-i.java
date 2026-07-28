class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int half = s.length()/2;
        int arr[] = new int[26];
        for(int i = 0; i<half;i++){
            arr[s.charAt(i)-'a']++;
        }
        StringBuilder l = new StringBuilder();
        for(int i = 0; i<26;i++){
            while(arr[i]>0){
                l.append((char)(i+'a'));
                arr[i]--;
            }
        }
        StringBuilder r = new StringBuilder(l).reverse();
       
        if(n%2==1){
            return l.toString()+s.charAt(half)+r.toString();
        }
        return l.toString()+r.toString();
    }
}