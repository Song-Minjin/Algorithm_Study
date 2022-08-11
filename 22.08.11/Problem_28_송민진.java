class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int original_x = x;

        // 각 자릿의 합 구하기
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        // 각 자릿수의 합으로 x가 나누어떨어지는지
        if (original_x % sum != 0) {
            answer = false;
        }
        return answer;
    }
}