class Solution {
    public int matrixScore(int[][] arr) {
       int m = arr.length, n = arr[0].length;
       for(int i = 0; i<m;i++){
        if(arr[i][0]==0){
            for(int j = 0;j<n;j++){
                if(arr[i][j]==0)arr[i][j]=1;
                else arr[i][j]=0;
            }
        }
       } 
       for(int j = 1; j<n;j++){
        int noz = 0, noO = 0;
        for(int i = 0; i<m; i++){
            if(arr[i][j]==0)noz++;
            else noO++;
        }
        if(noz>noO){
            for(int i = 0; i<m;i++){
                if(arr[i][j]==0)arr[i][j]=1;
                else arr[i][j]=0;
            }
        }
       }
       int res = 0; 
       int y = 1;
       for(int j = n-1;j>=0;j--){
        for(int i = 0; i<m;i++){
            res+=(arr[i][j]*y);
        }
        y*=2;
       }
       return res;
    }
}