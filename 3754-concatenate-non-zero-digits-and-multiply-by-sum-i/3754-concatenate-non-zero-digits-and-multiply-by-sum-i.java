class Solution {
    public long sumAndMultiply(int n) {

        int sum = 0;
        long num = 0;
        long place = 1;

        while (n > 0) {

            int digit = n % 10;

            sum += digit;

            if (digit != 0) {
                num = digit * place + num;
                place *= 10;
            }

            n = n / 10;
        }

        return num * sum;
    }
}