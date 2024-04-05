package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

public class 블로그재귀실험4 {



    public static void main(String[] args) {
        System.out.println(factorial(4));

    }

    private static int factorial(int k) {
        if (k == 1) {
            return 1;

        }
        return k * factorial(k - 1);
    }
}
