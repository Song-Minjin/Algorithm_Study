import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        float n_sqrt = (float) Math.sqrt(n);
        if (n_sqrt == (long) n_sqrt * 1.0) {
            return (long) Math.pow((n_sqrt + 1), 2);
        } else {
            return -1;
        }
    }
}