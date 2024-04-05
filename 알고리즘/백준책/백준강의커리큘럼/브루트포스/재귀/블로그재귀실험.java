package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

public class 블로그재귀실험 {

    public static void main(String[] args) {
        recur(3);

    }

    private static void recur(int k) {

        if (k == 0) {
            System.out.println("재귀 종료");
            return;
        }

        System.out.println("before : " + k);
        recur(k--);

        System.out.println("after : " + k);

    }
}
