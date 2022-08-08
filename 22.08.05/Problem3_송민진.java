class Solution {
    public String solution(String s) {
        int mid_index = s.length()/2;
        if(s.length() % 2 == 1){
            return s.substring(mid_index, mid_index+1);
        } else {
            return s.substring(mid_index-1, mid_index+1);
        }
    }
}