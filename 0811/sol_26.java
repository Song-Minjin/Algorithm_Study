import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        List<Integer> list = new ArrayList<Integer>();

        for(int a_list : arr)
            list.add(a_list);

        Collections.sort(list);

        if(list.size() == 1) return answer;

        answer = new int[list.size()-1];
        int min = list.get(0);
        
        int index = 0;
        for(int i=0; i<list.size();i++) {
                if(arr[i] == min){
                    continue;
                }
                else{
                    answer[index++] += arr[i];
                }

        }

        return answer;
    }
}
