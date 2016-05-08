package api.test;

/**
 * Created by lsw on 2016-04-23.
 */
public class ReferenceTest {

    public void passIntValue(int var) {
        var = var + 2;
    }
    public static void main(String...arg) {
        int passInt = 3;
        ReferenceTest rt = new ReferenceTest();
        short pass = 1;
        rt.passIntValue(passInt);
        System.out.println("the passInt valus is " + passInt);
    }

}
