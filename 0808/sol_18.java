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
