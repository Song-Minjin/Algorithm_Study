class Solution {
    public String solution(String s) {
        String answer = "";

        String[] s_list = s.split(" ");
        int s_cnt = 0;
        for (String str : s_list) {
            String str_tmp = "";
            for (int i = 0; i < str.length(); i++) {
                String letter = (i % 2 == 0) ? String.valueOf(str.charAt(i)).toUpperCase() : String.valueOf(str.charAt(i)).toLowerCase();
                str_tmp += letter;
            }
            answer += str_tmp;
            s_cnt += 1;
            if (s_cnt < s_list.length){
                answer += " ";
            }
        }
        return answer;
    }
}