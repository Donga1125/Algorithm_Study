package 알고리즘.leetcode;

public class 정처기4과목자바 {

    public static void main(String[] args) {

        int i = 0, sum = 0;

        while (i < 10) {
            i++;
            if (i % 2 == 1) {
                continue;

            }
            sum = sum + i;
        }

        System.out.println(sum);



    }
}
