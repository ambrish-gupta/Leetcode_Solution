class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        int m = indices.length;
        char[] news = new char[n];
        for(int i = 0 ; i<=n-1;i++){
          news[indices[i]] = s.charAt(i);
        }
        return new String(news);
    }
}