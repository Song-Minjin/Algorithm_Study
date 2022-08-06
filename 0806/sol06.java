class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
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
