package api.test;

/**
 * Created by lsw on 2016-04-02.
 */
public class Dummy {

    public static void main(String...arg) {

        System.out.println("Start test...");

        int i = 1;
        int j = 1;

        try {
            i++;
            j--;

            if (i/j >1) {
                i++;
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();

        }

        A x = new B();
        x.doIt();
    }



}
