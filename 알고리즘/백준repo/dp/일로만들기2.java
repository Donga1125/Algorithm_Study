package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일로만들기2 {
    //12852
    //3으로 나눠지면 3나누기, 2로 나눠지면 2 나누기, 1빼지면 1빼기
    // 3개를 섞어 사용하는데, 최소로 되는 경우를 찾아내자
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        count = 0;
        dp(n);




    }

    private static int dp(int n) {// 마지막 count가 가장 적은 수는 어떻게 찾지 ?


        if (n == 1) {
            return count;
        }

        if (n % 3 == 0 && n % 2 == 0) { //3가지 경우

        }
        if (n % 3 == 0) { // 3나누거나,1빼거나 두가지

        }
        if (n % 2 == 0) { // 2나누거나, 1빼거나

        }


        return dp(n - 1);} // 나누기가 안될경우
}
