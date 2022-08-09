class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i< s.length();i++) {
                if(Character.isDigit(s.charAt(i)) == false)
                    answer = false;
            }
        }
        else{
            answer = false;
        }
        return answer;
    }
}

----------------------------------------------------------------
// 예외처리 이용 풀이

class Solution {
  public boolean solution(String s) {
      if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
  }
}
