class Solution {
    public long solution(long n) {
        long answer = -1;
        
        for(long i=1; i*i<=n; i++){
            if(i * i == n) {
                answer = (i+1) * (i+1);
                break;
            }
        }
        return answer;
    }
}

---------------------------------------------------------
  Math 함수 사용
  
  class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
}
