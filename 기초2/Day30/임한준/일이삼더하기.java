package 기초2.Day30.임한준;

import java.util.Scanner;

public class 일이삼더하기 {

    /**
     문제 9095
     정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

     1+1+1+1
     1+1+2
     1+2+1
     2+1+1
     2+2
     1+3
     3+1
     정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

     입력
     첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.

     출력
     각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
     */

    static int dp[] = new int [11];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        dp[1] =1; //초기 값 초기화
        dp[2]=2;
        dp[3]=4;

        for(int j=4;j<=10;j++) { // 4부터 반복
            dp[j] = dp[j-3] + dp[j-2] + dp[j-1]; // 점화식
        }

        for(int i=0;i<t;i++) {
            int n = sc.nextInt();

            System.out.println(dp[n]);
        }

    }
}
