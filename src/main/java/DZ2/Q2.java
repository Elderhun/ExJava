package DZ2;

public class Q2 {

    public static void main(String[] args) {

        int[] intArray = {2,15,12,9,3,4,2,15,24};
        dMet(intArray);

    }

    public static void dMet(int[] intArray) {

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Check array. Index not found");
        }

    }
}
