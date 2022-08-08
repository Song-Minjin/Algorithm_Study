class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String name = "Kim";

        for(int i=0; i<seoul.length; i++)
            if(name.equals(seoul[i])){
                answer = "김서방은 "+i+"에 있다";
                break;
            }

        return answer;
    }
}

-----------------------------------------------------------------------------
  List 사용
  
import java.util.Arrays;

public class FindKim {
    public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }
}
