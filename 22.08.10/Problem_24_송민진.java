import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        // 각 자리수 Arraylist에 넣기
        ArrayList<Long> tmp = new ArrayList<Long>();
        while (n > 0){
            tmp.add(n % 10);
            n /= 10;
        }

        // 작은 수부터 정렬
        Collections.sort(tmp);

        // 작은 수부터 1의 자리에 넣고 그 윗자리는 *10 해서 쌓기
        int cnt = 0;
        for (long j : tmp){
            j *= Math.pow(10, cnt);
            answer += j;
            cnt += 1;
        }

        return answer;
    }
}

// 다른 풀이 1
public class ReverseInt {
    public int reverseInt(int n) {
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char) c) + res);
        return Integer.parseInt(res);
    }
}

// 다른 풀이 2
import java.util.*;

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}

// 다른 풀이 3
import java.util.*;

class Solution {
    public long solution(long n) {
        return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString());
    }
}