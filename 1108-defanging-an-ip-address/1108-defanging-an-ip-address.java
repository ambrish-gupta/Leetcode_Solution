class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = address.length();
        while(i<j){
            if(address.charAt(i)=='.'){
                ans.append("[.]");
            }else{
                ans.append(address.charAt(i));
            }
            i++;
           
        }
        return ans.toString();
    }
}