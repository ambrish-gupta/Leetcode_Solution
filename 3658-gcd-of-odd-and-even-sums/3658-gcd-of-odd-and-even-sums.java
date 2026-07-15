class Solution {
    public int gcdOfOddEvenSums(int n) {
        int gcd = 1;
        int sum1 = 0;
        int sum2 = 0;
        int j=1;
        for (int i = 1; i <= n; i++) {
            sum1 += j;
            j++;
            sum2 += j;
            j++;
        }
        int a = 2;
        int maxx = 1;
        while (a <= n) {
            if (sum1 % a == 0 && sum2 % a == 0) {
                maxx = a;
                gcd = Math.max(maxx, gcd);
            }
            a++;
        }
        return gcd;
    }
}