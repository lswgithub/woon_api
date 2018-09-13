import java.util.*;
import java.util.concurrent.*;


public ArrayAndString {
    
    public public static void main (Strings...args){
    }
    
    
    public void testHashMap() {
        private static final int MAX_THREADS = 10;
        // HashTable         : Key, value (value 에 Null 허용을 하지 않는다)
        // MashMap           : key, value (Value 에 null 을 허용한다.)
        // ConcurrentHashMap : key , value (value 에 Null 허용을 하지 않는다)
        private static HashTable<String, Integet> ht = new HashTable<Stirng, Integet>();
        private static HashMap<String, Integet> hm = new HashMap<Stirng, Integet>();
        private static HashMap<String, Integet> hmSyn = new HashMap<Stirng, Integet>();
        private static HashMap<String, Integet> hmSyn2 = Collections.sychronizedMap(new HashMap<String, Integet>());
        private static ConcurrentHashMap<String, Integet> chm = new ConcurrentHashMap<Stirng, Integet>();

        ExecutorService es = Executors.newFixedThreadPool(MAX_THREADS);
        for(int j = 0; j < MAX_THREADS; j++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0 ; i < 1000; i++){
                        String key = String.valueOf(i);
                        
                        ht.put(key, i);
                        hm.put(key, i);
                        hmSyn2.put(key, i);
                        chm.put(key, i);
                        
                        synchronized (hmSyn) {
                            hmSyn.put(key, i);
                        }
                    }
                }
            });
        }
        es.shutdown();
        
        try {
            es.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch(Exception e) { // InterruptecException
            e.printStackTrace();
        }
    }
    
    //check resizing factory > ResizableArrays
    ArrayList<String testArrayList (String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for(String x : words) sentence.add(x);
        for(String x : more) sentence.add(x);
        
        return sentence;
    }
    
    //a sequence of nodes.
    // Unlike an array, a linked list does not provide constant time access to paticular "index" within the list;
    // LinkedList 의 장점은 리스트의 시작과 끝에 데이터 추가 삭제가 용이함..
    public testLinkedList() {
        class Node {
            Node next = null;
            int data;
            
            public Node(int d) {
                data = d;
            }
            
            void appendToTail(int d) {
                Node end = new Node(d);
                Node n = this;
                while (n.next != null) {
                    n = n.next;
                }
                n.next = end;
            }
        }
    }
    
    //StringBuilder
    //문자를 연결(병합)하려고 할때 String 사용시 ...
    //배열 첫번째 X문자들 복사, 두번째 2X... 3X...O(xn2)
    String joinWords(String[] words) {
        String joinWord = "";
        for(String word : words) {
            joinWord = joinWord + word;
        }
        
        return joinWord;
    }
    
    //StringBuilder 사용 시 위의 문제를 해결할 수 있다.
    String joinString(String[] words) {
        StringBuilder sentence = new StringBuilder();
        for(String word : words) {
            sentence.append(word);
        }
        return sentence.toString();
    }
    
    
    
    
    
    
    
}


