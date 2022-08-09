class Solution {
    public boolean solution(String s) {
            boolean answer = true;

            // 4 or 6인지
            answer = (s.length() == 4 || s.length() == 6) ? true : false;

            // 숫자로만 구성되어 있는지
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                    continue;
                } else{
                    return false;
                }
            }
            return answer;
    }
}

