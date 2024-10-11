package 알고리즘.leetcode.september;

public class PermutationinString {

    public static void main(String[] args) {

        PermutationinString ar = new PermutationinString();
        int s = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (ar.complete(i) == 1) {
//                s += i;
//            }
//        }


        System.out.printf("%d", s);
        ar.checkInclusion("sad", "asd");

    }

    public boolean checkInclusion(String s1, String s2) {

        int i, m, f = 1;




        return true;

    }

    public int complete(int n) {
        int sum = 0;
        for (int j = 1; j <= n/2; j++) {

            if (n % j == 0) {
                sum = sum + j;
            }

        }

        if (sum == n) {
            return 1;
        } else
            return 0;
    }
}
