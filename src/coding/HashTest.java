package coding;

import java.util.*;
public class HashTest {

    public static void main(String[] args) {
        System.out.println("test");
        String[] participant ={"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        
        HashTest ht = new HashTest();
        String answer = ht.solution(participant, completion);
        System.out.println("answer:" + answer);
        String answer2 = ht.solutionHash(participant, completion);
        System.out.println("answer2:" + answer2);
    }
    
    // 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    // participant	completion	return
    // [leo, kiki, eden]	[eden, kiki]	leo
    
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, String>  completionResult = new HashMap<String, String>();
        
        for(int i = 0 ; i < participant.length ; i ++) {
            boolean isCompletion = false;
            for(int j = 0 ; j < completion.length; j++) {
                if(participant[i] == completion[j]) isCompletion = true;     
            }
            if (isCompletion == false) {
              answer =  participant[i];
            }
        }
        return answer;
    }
    
    public String solutionHash(String[] participant, String[] completion) {
        String answer = "";
        
        Map<Integer, String> pHashMap = new HashMap<Integer, String>();
        Map<Integer, String> cHashMap = new HashMap<Integer, String>();
        
        for (int i = 0 ; i < participant.length; i++) pHashMap.put(i, participant[i]);
        for (int i = 0 ; i < completion.length; i++) cHashMap.put(i, completion[i]);
        
        for(Map.Entry<Integer, String> entry : pHashMap.entrySet()) {
            if(cHashMap.containsValue(entry.getValue()) == false) answer = entry.getValue();
        }
        
        return answer;
    }
    
}