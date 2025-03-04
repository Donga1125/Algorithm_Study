package 알고리즘.leetcode.march25;

public class CheckifNumberisaSumofPowersofThree {

    //1780. Check if Number is a Sum of Powers of Three
    // 3의 제곱근만 써서 나타낼 수 있으면 true

    public static void main(String[] args) {
        int n = 91;
        CheckifNumberisaSumofPowersofThree main = new CheckifNumberisaSumofPowersofThree();
        main.checkPowersOfThree(n);

    }

    public boolean checkPowersOfThree(int n) {

        while (n > 0) {
            int remainder = n % 3;
            if (remainder > 1) {
                return false;
            }
            n /= 3;

        }
        return true;

    }
}
