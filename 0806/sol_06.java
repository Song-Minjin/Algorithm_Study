class Solution {
    public int solution(int[] numbers) {
        
        // 범위의 값이 정해져 있기 때문에 1~10까지 더한 45를 answer에 할당
        int answer = 45;
        
        // numbers의 길이만큼 for문을 돌아 numbers안에 있는 값을 빼기
        for(int i=0; i<numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}



--------------------------------------------- 
  // 다른분이 for each 사용해서 해결하셨는데 이 풀이가 더 좋아보여서 올렸습니다.

class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}
