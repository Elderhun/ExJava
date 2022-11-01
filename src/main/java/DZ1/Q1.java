package DZ1;

public class Q1 {

    public static void main(String[] args) {

        int[] fArr = {1,2,3,4,5,6,7,8,9,10};
        int[] sArr = {10,9,8,7,6,5,4,3,2,};
        int[] nArr = ArrNew(fArr, sArr);
        for (int el:nArr) {
            System.out.println(el);
        }
    }

    public static int[] ArrNew(int[] first, int[] second) {


        int[] nArr;

            if(first.length == 0 || second.length == 0)
                throw new RuntimeException("One of the arrays is empty");

            else if(first.length!=second.length){
                throw new RuntimeException("Array lengths do not match");
            }
            else {
                nArr = new int[first.length];
                for (int i = 0; i < first.length; i++) {
                    nArr[i] = first[i] + second[i];
                }
            }
        return nArr;
    }
}