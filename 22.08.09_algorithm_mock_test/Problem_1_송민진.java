package Innovation_mock_test;

public class Problem1 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        // 일주일 (7번) 반복
        for (int i = 0; i < arr1.length; i++) {

            // 체크아웃이 새벽 5시 이후일 경우 21시로 변경
            if (arr2[i] >= 29) {
                arr2[i] = 21;
            }

            // 하루 총 공부시간 구하기
            int period = arr2[i] - arr1[i];
            answer += period;
        }
        return answer;
    }


    public static void main(String[] args) {
        Problem1 method = new Problem1();
        // 지정 입력값 -> result = 102
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));
    }
}