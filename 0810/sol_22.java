import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int lenth = (int)Math.log10(n)+1;
        for(int i = 0; i < lenth; i++) {
            answer += n%10;
            n = n/10;
        }  
        return answer;
    }
}

---------------------------------------------------------
Math 함수 없이 while 문으로만 해결한 코드입니다.  
  
  
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(true){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
