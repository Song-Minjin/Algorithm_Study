public class Problem2 {
    public String solution(int n) {

        String answer = "";
        int sum = 0;

        // 한 자리씩 나눠 더하기
        while (n > 0) {
            int tmp = n % 10;      // 뒤에서부터 한 자리씩 정수형으로 분리해내기
            sum += tmp;          // 한 자리씩 sum에 더하기
            n /= 10;                 // 정수 n에 ÷10을 해서 자릿수 줄이기

            // 출력할 문자열로 정리
            if (n == 0) {                            // 마지막 자리일 땐
                answer += tmp + "=" + sum;     // 숫자 뒤에 " = 합계" 붙이기
            } else {                                 // 마지막 자리 아닐 땐
                answer += tmp + "+";                 // 숫자 뒤에 "+" 붙여주기
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem2 method = new Problem2();
        // 지정 입력값
        System.out.println(method.solution(718253));

        // // 입출력 예 1
        // System.out.println(method.solution(12345));
        // // 입출력 예 2
        // System.out.println(method.solution(1532576));
    }
}