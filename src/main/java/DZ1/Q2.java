package DZ1;

public class Q2 {
    public static void main(String[] args) {

        int[] fArr = {1,2,3,4,5,6,7,8,9,10};
        int[] sArr = {10,9,8,7,6,5,4,3,2};
        int[] nArr = ArrNew(fArr, sArr);
        for (int el:nArr) {
            System.out.println(el);
        }
    }


    public static int[] ArrNew(int[] first, int[] second) {


        int[] nArr = new int[0];
        try {

            if(first.length!=second.length){
                throw new RuntimeException();
            }
            else {
                nArr = new int[first.length];
                for (int i = 0; i < first.length; i++) {
                    nArr[i] = first[i] / second[i];
                }
            }

        } catch (Exception e) {
            int size1 = first.length;
            int size2 = second.length;
            System.out.printf("Array lengths do not match. fArr = %s, sArr = %s%n", size1, size2);
        }

        return nArr;
    }
}

