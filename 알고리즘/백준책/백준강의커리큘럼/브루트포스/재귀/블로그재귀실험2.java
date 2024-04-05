package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

public class 블로그재귀실험2 {

    static int n = 3;
    static int cnt = 0;

    public static void main(String[] args) {
        recUserMember(0);
        System.out.println(cnt);

    }

    private static void recUserMember(int k) {
        if (k == n) {
            cnt++;
            return;
        }
        recUserMember(k + 1);
    }
}
