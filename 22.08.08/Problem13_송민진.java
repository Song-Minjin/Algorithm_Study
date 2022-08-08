class Solution {
    public String solution(int a, int b) {
//        String answer = "";
//        return answer;
        String[] day = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] days_of_months = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int days_sum = 0;
        for(int i = 0; i < a-1; i++){
            days_sum += days_of_months[i];
        }
        days_sum += b ;

        return day[days_sum % 7];

    }
}