class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;

       List<List<Integer>> res = new ArrayList<>();
        while(k>0){
       int temp = grid[r-1][c-1];
            for(int i = r-1; i>=0;i--){
                for(int j = c-1;j>=0;j--){
                   if(i == 0 && j == 0){
                    grid[i][j] = temp;
                   }else if(j == 0){
                    grid[i][j] = grid[i-1][c-1];
                   }else{
                    grid[i][j] = grid[i][j-1];
                   } 
                   
                }
            }
            k--;
        }
        for(int i = 0;i<r;i++){
            res.add(new ArrayList<>());
            for(int j = 0; j<c;j++){
                res.get(i).add(grid[i][j]);
               
            } 
        }
    return res;
    }
}