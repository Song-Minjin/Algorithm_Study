class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        // for each문으로 i에 arr의 값 넣고 answer에 더하기
            for(int i : arr)
                answer += i;
        // answer에 arr의 길이만큼 나누기
            return answer/arr.length;
    }
}


--------------------------------------------------------------------
  라이브러리 사용하셔서 한줄로 끝내시는 분이 계시네요...
  
  
public class GetMean {
    public int getMean(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);
    }
