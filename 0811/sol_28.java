class Solution {
public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int length = (int)Math.log10(x)+1;
        int y = x;
        for(int i=0; i<length; i++) {
            sum += x % 10;
            x = x / 10;
        }

        if(y % sum == 0) answer = true;

        return answer;
        }
}
