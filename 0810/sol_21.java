class Solution {
        public String solution(String s) {
                String answer = "";
                String[] Split = s.split(" ",-1);

                for(int i=0;i<Split.length; i++){
                        for(int j=0; j<Split[i].length();j++) {
                                char ch = Split[i].charAt(j);
                                if(j%2 == 0) {
                                        answer += Character.toUpperCase(ch);;
                                }
                                else
                                        answer += Character.toLowerCase(ch);

                        }
                        if(Split.length-1 == i)
                            break;
                        else
                            answer += " ";
                }


                return answer;
        }
}

------------------------------------------------------------------
  ASCII CODE 사용해서 앞문자가 대문자라면 소문자로 변환하며 해결
  
  
  class Solution {
    public String solution(String s) {
        String answer;
        answer = s.toUpperCase();
        char[] chars = answer.toCharArray();

        //앞문자가 대문자라면 소문자로 치환
        for (int i = 1; i < chars.length; i++) {
            if (62 <= chars[i - 1] && chars[i - 1] <= 90) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }
}
