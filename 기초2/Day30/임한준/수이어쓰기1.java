package 기초2.Day30.임한준;

import java.io.*;
import java.util.StringTokenizer;

public class 수이어쓰기1 {

    /**
     문제 1748
     1부터 N까지의 수를 이어서 쓰면 다음과 같이 새로운 하나의 수를 얻을 수 있다.

     1234567891011121314151617181920212223...

     이렇게 만들어진 새로운 수는 몇 자리 수일까? 이 수의 자릿수를 구하는 프로그램을 작성하시오.

     입력
     첫째 줄에 N(1 ≤ N ≤ 100,000,000)이 주어진다.

     출력
     첫째 줄에 새로운 수의 자릿수를 출력한다.
     */

    //수 받으면 하나씩 돌면서 쭉 이어 붙이고 length q반환
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int num = 1;
        int temp = 10; // 10의 자리수 설정

        for (int i = 1; i <= n ; i++) {
            if (i == temp) {
                num += 1;
                temp *= 10; // 10, 100 1000
            }
            count += num;

        }

        System.out.println(count);

    }
}






