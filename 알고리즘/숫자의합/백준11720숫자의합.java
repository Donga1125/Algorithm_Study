package 알고리즘.숫자의합;

//문제
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//출력
//입력으로 주어진 숫자 N개의 합을 출력한다.

import java.io.*;

public class 백준11720숫자의합 {

    static int N;
    static int num1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 개 어이없네 String 값으로 들어온다고 생각했는데 걍 54,321 이 들어오는 거다;// 상관없다 String으로 받아도 됨
        // n이 100개가 주어지면 밑에 숫자는 100자리의 숫자를 담게 되는데, int나 long으로는 받을 수 없다.. 그래서 결국엔
        // String으로 받는 게 맞다... 내가 했던 게 결과적으론 맞다!
        //

        int answer = 0;

        N = Integer.parseInt(br.readLine());
        //num = Integer.parseInt(br.readLine());
        String num = br.readLine();

        //54321을 만의 자리를 빼는 방법 5x 10000 = 50000


        for (int i = 0; i < N; i++) {
//            answer = answer + num.charAt(i) - '0';
            answer = answer + Character.getNumericValue(num.charAt(i));




        }

        System.out.println(answer);
    }

}
