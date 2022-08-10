import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int len = (int)Math.log10(n)+1;

        answer = new int[len];
        for(int i=0; i<len; i++){
            answer[i] = (int)(n % 10);
            n /= 10;
        }

        return answer;
    }
}
