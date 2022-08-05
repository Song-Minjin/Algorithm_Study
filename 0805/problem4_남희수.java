import java.util.Scanner;

public class sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (true) {

            System.out.println("정수 a,b를 입력하세요");
            a = sc.nextInt();
            b = sc.nextInt();

            // a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
            if (a < -10000000 || a > 10000000 || b < -10000000 || b > 10000000)
                continue;

            int result = 0;
            int bigger, smaller = 0;

            /*
             * 입력받은 두 수(a,b) 대수비교
             * 1. a가 b보다 클 경우
             * 2. b가 a보다 클 경우
             * 3. a와 b가 같을 경우
             */
            if (a > b) {
                bigger = a;
                smaller = b;
            } else if (a < b) {
                bigger = b;
                smaller = a;
            } else {
                bigger = a;
                smaller = a;
            }

            // 두 수사이의 값 더하기
            for (int i = smaller; i < bigger + 1; i++) {
                result += i;
            }
            System.out.printf("return값은 %d입니다", result);
            sc.close();
            break;
        }
    }
}