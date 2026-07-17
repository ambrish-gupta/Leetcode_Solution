class Solution {
    public List<String> stringMatching(String[] s) {
        ArrayList<String> ans = new ArrayList<>();
        int n = s.length;
        for(int i = 0; i<n;i++){
            for(int j = 0;j<n;j++){
                if(s[j].contains(s[i]) && i!=j){
                    ans.add(s[i]);
                    break;
                }
                
            }
        }
        return ans;
    }
}