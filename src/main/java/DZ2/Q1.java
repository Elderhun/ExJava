package DZ2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Q1 {


    public static void main(String[] args) {

            float num = floatNum();
            System.out.println(num);
    }


    public static float floatNum() {


        Scanner s = new Scanner(System.in);
        try {
            float fnum = s.nextFloat();
            return fnum;
        } catch (InputMismatchException ex) {
            System.out.println("Not a float type. Retry enter");
        }
        return floatNum();
    }
}