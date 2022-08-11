import java.util.*;

// trial 1 - 런타임 에러
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        // 빈 배열일 경우
        if (arr.length == 1) {
            int[] special_answer = {-1};
            return special_answer;
        }

        // 최솟값 구하기
        int min = arr[0];
        for (int i : arr) min = Math.min(i, min);

        // 최솟값 아닌 값들만 배열에 넣기
        int new_index = 0;
        for (int j : arr){
            if (j != min){
                answer[new_index] = j;
                new_index += 1;
            }
        }
        return answer;
    }
}

// trial 2 - 정렬 이용
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        // 빈 배열일 경우
        if (arr.length == 1) {
            int[] special_answer = {-1};
            return special_answer;
        }

        // 최솟값 구하기
        Arrays.sort(arr);
        int min = arr[0];

        // 최솟값 아닌 값들만 배열에 넣기
        int new_index = 0;
        for (int j : arr){
            if (j != min){
                answer[new_index] = j;
            }
            new_index += 1;
        }
        return answer;
    }
}


