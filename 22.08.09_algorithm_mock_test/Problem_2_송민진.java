package Innovation_mock_test;

public class Problem2 {
    public String solution(int month, int day) {
        String answer = "";
        int fin_month = 0;
        int fin_day = 0;

        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 누적 날짜 sum_days에 이번 달 날짜 더하기
        int cur_month = month -1;            // 현재 달의 인덱스  = month-1
        int sum_days = month_days[cur_month] - day;      // 이번 달의 남은 날들 더하기
        cur_month += 1;         // 다음 달로 넘어가기
        cur_month %= 12;        // 만약 12월이 넘어가면 다시 1월로 돌아가기

        // 한 달씩 더해가며 98일까지 더하기
        while (sum_days < 99) {

            // 이번 달 말일 내에 98일 경과가 될 때 : 반복문 종료
            if (sum_days + month_days[cur_month] >= 98) {
                fin_month = cur_month + 1;          // 종료 달 = 이번 달 = 이번 달 인덱스 + 1
                fin_day = 98 - sum_days;            // 종료 날짜 = 98 - 누적 일수
                answer = fin_month + "월 " + fin_day + "일";      // 종료 달과 종료 날짜 출력
                break;
            }

            //이번 달 내에 안 끝날 경우
            sum_days += month_days[cur_month];   // 누적 날짜에 이번 달 날짜 더하기
            cur_month += 1;         // 다음 달로 넘어가기
            cur_month %= 12;        // 만약 12월이 넘어가면 다시 1월로 돌아가기
        }
        return answer;
    }


    public static void main(String[] args) {
        Problem2 method = new Problem2();
        System.out.println(method.solution(11, 27));
        System.out.println(method.solution(6, 22));
        System.out.println(method.solution(1, 18));
    }
}