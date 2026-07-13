class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // rotate -> reverse each row
        for (int i = 0; i < n; i++) {
            int a = 0, b = n - 1;

            while (a < b) {
                // swap arr[i][a] and arr[i][b]
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }
    }
}
