저는 substring으로 문자열을 끊어서 해결하였습니다.

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        // phone_number 길이의 -4까지 반복하여 "*"을 찍어 answer에 추가
        for(int i=0; i<phone_number.length()-4;i++){
            answer +="*";
        }
        // substring으로 phone_number의 마지막 4자리를 끊어 answer에 추가
        answer += phone_number.substring(phone_number.length()-4);
        
        
        return answer;
    }
}


-------------------------------------------------------

문자열을 char배열로 만들어 인덱스값을 바꿔서 푸신 분 풀이

class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}


-----------------------------------------------------------------------------
다른분의 정규식 풀이
너무 어렵네요..

class Solution {
  public String solution(String phone_number) {
    return phone_number.replaceAll(".(?=.{4})", "*");
  }
}
