
public class SimpleQuiz {


    //Q) Anagram
    //서로 다른 두 문자열을 알파벳으로 재배열을 알파벳을 재배열 하였을때 같은단어
    public boolean checkAnagram (String str1, String str2) {
        
        boolean isAnagram = true;
        
        if(str1 == "" || str2 =="") isAnagram = false;
        
        if(str1.length() != str2.length()) isAnagram = false;
        
        if(isAnagram) {
            char[] charStr1 = str1.toLowerCase().toCharArray();
            char[] charStr2 = str2.toLowerCase().toCharArray();
            
            Arrays.sort(charStr1);
            Arrays.sort(charStr2);
            
            String sortedStr1 = new String(charStr1);
            String sortedStr2 = new String(charStr2);
            
            isAnagram = sortedStr1.equals(sortedStr2);
        }
        
        return isAngram;
        
    }
    
    
    
    
    
}