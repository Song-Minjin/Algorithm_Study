class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        // absolutes의 길이만큼 반복
        for(int i=0; i<absolutes.length; i++){
            // 만약 signs의 값이 true라면 answer에 더하기
            if(signs[i] == true)
                answer += absolutes[i];
            // signs의 값이 false라면 answer에 빼기
            else
                answer -= absolutes[i];
        }
        return answer;
    }
}

----------------------------------------------------
저는 signs 값이 true면 더하고 false면 빼는 형식이였지만,
다른분께서는 signs값이 true면 그냥 더하고 false면 -1을 곱하신 후 더하셨습니다.

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}
