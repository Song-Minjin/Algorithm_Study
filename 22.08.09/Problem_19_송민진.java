class Solution {
    public String solution(int n) {
        String answer = "";
        String[] letter = {"수", "박"};

        for(int i = 0; i < n; i++){
            answer += letter[(i % 2 == 0) ? 0 : 1];
        }

        return answer;
    }
}