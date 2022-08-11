class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long l_num = num;

        while (l_num != 1) {
            l_num = (l_num % 2 == 0) ? l_num / 2 : l_num * 3 + 1;
            cnt += 1;

            if (cnt > 500) {
                answer = -1;
                break;
            } else {
                answer = cnt;
            }
        }
        return answer;
    }
}

/*
what I learned
- int overflow 주의!
*/
