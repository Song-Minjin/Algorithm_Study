// trial 1 : 정확도 테스트 - 통과, 효율성 테스트 - 시간 초과
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // completion을 ArrayList로 변환
        ArrayList<String> arr_completion = new ArrayList<>(Arrays.asList(completion));

        // 각 배열의 요소 하나씩 비교
        for (String i : participant) {
            if (arr_completion.contains(i)) {         // 공통된 요소가 발견되면,
                arr_completion.remove(i);        // arr_completion에서 공통 요소를 제거함
            } else {
                answer = i;
                break;
            }
        }
        return answer;
    }
}


// trial 2 : 인터넷 풀이 참조 - 정렬 후 비교
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);


        for(int i = 0; i < completion.length; i++){
            if(participant[i].equals(completion[i])) {
                continue;
            } else {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
}