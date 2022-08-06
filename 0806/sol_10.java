저는 answer에 길이를 할당해주고 2중 for문 사용해서 해결하였습니다.

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        // answer 2중배열에 크기 할당
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        // 2중 for문으로 arr1[0][0] 과 arr2[0][0] 부터 arr1의 배열 크기만큼 인덱스를 올려 더하기
        for(int i=0; i < arr1.length; i++){
            for(int j=0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}





-------------------------------------------------------------------
  다른분은 어처피 arr의 길이는 같다는 설정이 있어 answer에 arr1을 할당해서 푸셨습니다.
  
  
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}
