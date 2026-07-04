class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int i = 0;
        int maxcnt = 0;
        while (i < n) {
            int cnt = 1;

            int j = 0;
            while (j < sentences[i].length()) {

                if (sentences[i].charAt(j) == ' ') {
                    cnt++;
                }
                j++;
            }
            if (cnt > maxcnt) {
                maxcnt = cnt;
            }
            i++;
        }
        return maxcnt;
    }
}