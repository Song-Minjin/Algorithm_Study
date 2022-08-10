import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer;
        int len = 0;

        // Arraylist 만들어서 넣기
        ArrayList<Integer> tmp_list = new ArrayList<Integer>();
        while(n > 0){
            int tmp = (int) (n % 10);       // 주의
            tmp_list.add(tmp);
            n /= 10;
            len += 1;
        }

        // Array에 넣기
        answer = new int[len];
        for (int i = 0; i < tmp_list.size(); i++){
            answer[i] = tmp_list.get(i);
        }
        return answer;
    }
}