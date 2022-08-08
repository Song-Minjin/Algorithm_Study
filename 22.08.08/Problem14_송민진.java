import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        List<Integer> tmp = new ArrayList<Integer>();

        for( int i=0; i < arr.length; i++)
            if (arr[i] % divisor == 0){
                tmp.add(arr[i]);
            }

        int[] answer = {-1};
        if (tmp.size() == 0) {
            return answer;
        }

        answer = new int[tmp.size()];

        for (int j = 0; j < tmp.size(); j++) {
            answer[j] = tmp.get(j);
        }
        Arrays.sort(answer);

        return answer;
    }
}