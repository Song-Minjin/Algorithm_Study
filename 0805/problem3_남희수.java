class Solution {
    public String solution(String s) {
        int index = s.length();
        if (index % 2 == 0) {
            return s.substring(index / 2 - 1, index / 2 + 1);
        } else {
            return String.valueOf(s.charAt(index / 2));
        }
    }
}