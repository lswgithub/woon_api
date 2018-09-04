//Describe the data transfer "algorithm" runtime as
//Electronic Transfer :O(s), where s is the size of the file. this means that the time to trasfer the file increases linearly with the size of the file.
//O(log N),O(N log N),O(N),)(N2) and O(2N)
//-O(big O)big O describes an upper bound on the time
//-Ω(big omega): Ω is the equivalent concept but for lower bound.
//-θ(big theta): Θ means both O and Θ
public class BigO {
    
    //code like this would take O(n) time and O(n) space.
    int sum(int n) {
        if(n <=0) {
            return 0;
        }
        return n + sum(n-1);
    }
    
    //호출된 횟수만큼의 공간할당? 이 필요한 것이 아니다.
    int pairSumSequence(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }
    
    int pairSum(int a, int b) {
        return a + b;
    }
    
    //Big O는 일반적?인 예측 지표이지만 절대적인것은 아니다.
    //O(N)이 O(N2) 보다 어떤 상황에서든 향상된 성능을 보이는 것이 아니다.
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
    
    public Array minAndMax(Array arr, bigOMethod int) {
        if(bigOMethod == 1) {
            //one for loop and 2 lines
            for(int x: arr) {
                if(X < min) min = x;
                if(x > max) max = x;
            }
        } else {
           // two loops and 1 line
            for(int x: arr) {
                if(X < min) min = x;
            }
            
            for(int x: arr) {
                if(x > max) max = x;
            }
        }
    }
    
    //Add VS Multiply
    public void addPrint(Array arrA, Array arrB, String runtimeType){
        if(runtimeType == "ADD") {
            //add "do this, then, when you're all done, do that"
            for(int a : arrA) {
                print(a);    
            }          
            for(int b : arrB) {
                print(b);
            }
        } else {
            //Multiply "do this for each time you do that"
            for(int a : arrA) {
                for(int b: arrB) {
                    print(a + "," + b);
                }
            }
        }
    }
    
    
    
    public static void main(String...args) {
        //Each of thes calls is added to the call stack and takes up actual memory.
        sum(4) -> sum(3) -> sum(2) -> sum(1)
    }
    
    
}