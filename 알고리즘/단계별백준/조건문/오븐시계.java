package 알고리즘.단계별백준.조건문;

import java.util.Scanner;


public class 오븐시계 {
    // 시간과 분이 있고 분이 주어지면 더해줘서 디지털 시계로 반환해라
    // 따로 따로 분처리해서 60 넘는 지 확인해서 더해주는 방법 1
    // 다 합쳐서 그 값을 디지털 시계로 다시 반환할 수도 있겠다.. 둘다 해보자

    public static void main(String[] args)  {
        // 입출력 받기
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 17
        int b = sc.nextInt(); // 40 130/60
        int c = sc.nextInt(); // 80

        //if 문으로 a시 b분에서 c 분 더해주기(
        int m = b + c;
        int answerM = 0;
        int answerX = 0;

        if (m < 60) {

            System.out.println(a + " " + m);
        } else    {
            answerM = m / 60;
//            Math.floor(answerM)
            answerX = 60 * answerM;
            m = m - answerX;
            a = a + answerM;
        if (a >= 24) {
            a = a - 24;
        }
            System.out.println(a + " " + m);
        }






    }
}
