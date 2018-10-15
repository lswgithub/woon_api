
//피보나치 수는 0rhk 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ...

public class FibonacciNum {
    
    public static int[] tables;
    
    
    public static int fibo(int data) {
        if(data <= 1) return 1;
        
        return fibo(data-1) + fibo(data -2);
    }
    
    public static int memoFibo(int data) {
        if(data <= 1) {
            table[data] = 1;
            return 1;
        }
        
        if (table[data] > 0) {
            return table[data];
        }
        
        table[data] = memoFibo(data -1) + menoFibo(data -2);
        
        return table[data];
    }
    
    public static int factriall(int data) {
        if( data <= 1) return 1;
        
        return factriall(data -1) * data;
        
        
    }
    
    public static void randomQuiz() {
        
        for(int i=0; i < 50 ; i ++ ){
         int randomValue = (int) (Math.random() * 10) + 1;   
        }
    }
    
    
}