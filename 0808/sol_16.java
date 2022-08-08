class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0;
        int y_cnt = 0;
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                p_cnt++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                y_cnt++;
        }
        
        if(p_cnt != y_cnt)
            answer = false;
        return answer;

        
    }
}

--------------------------------------------------------------------------------
  // 변수를 하나만 사용해서 풀 수도 있네요...
  
  class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    }
}
  
