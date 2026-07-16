class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
       int r = arr.length;
       int c = arr[0].length;
       List <Integer> res = new ArrayList<>();
       int top = 0;
       int bottom = r-1;
       int left = 0; 
       int right = c-1;
      while(top<=bottom && left<=right){
          for(int i = left; i<=right;i++){
              res.add(arr[top][i]);
          }
          top++;
          for(int i = top; i<=bottom; i++){
             res.add(arr[i][right]);
          }
          right--;
          if(top<=bottom){
          for(int i = right;i>=left;i--){
              res.add(arr[bottom][i]);
          }
          bottom--;
          }
          if(left<=right){
          for(int i = bottom;i>=top;i--){
              res.add(arr[i][left]);
          }
          left++;
          }
      }
    return res;
    }
}