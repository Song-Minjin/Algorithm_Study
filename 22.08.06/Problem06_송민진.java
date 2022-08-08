import java.util.Arrays;
class Solution6 {
    public int solution(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        int answer = 9 * 10 / 2 - sum;
        return answer;
    }
}