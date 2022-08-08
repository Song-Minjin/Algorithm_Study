import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        List<String> list = new ArrayList<String>();
        int index = 0;
        list.add("수");
        list.add("박");

        for(int i=0; i<n; i++){
            answer += list.get(index);
            index++;
            if(index > 1 )
                index -=2;
        }


        return answer;
    }
}


-----------------------------------------------------------------
 // 3항연산자 사용. 알고있어도 쓸 때 되면 자꾸 까먹네요..
  
  public class WaterMelon {
    public String watermelon(int n){
    String result = "";
    for (int i = 0; i < n; i++)
      result += i % 2 == 0 ? "수" : "박";
        return result;
    }
