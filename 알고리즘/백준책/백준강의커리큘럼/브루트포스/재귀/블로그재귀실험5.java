package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

public class 블로그재귀실험5 {
    static int n = 3;



    public static void main(String[] args) {
        System.out.println(reReturn(0));

    }

    private static int reReturn(int k) {
        if (k == n) {
            return 1;

        }
        return reReturn(k + 1) + reReturn(k + 1);
    }
}
