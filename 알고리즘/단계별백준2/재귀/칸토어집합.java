package 알고리즘.단계별백준2.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 칸토어집합 {

    static char[] lineArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();


        while ((str = br.readLine()) != null && !str.isEmpty()) { // 이런 식으로 할당할때 확인
            // while문을 이용해서 입력이 null일 때 까지 입력 받는다.
            //문제는 이 방식은 입력을 파일로 받을 때나 통하고,
            // IntelliJ 같은 IDE에서 입력 받을 경우 값을 입력을 끝내고
            // 입력하지 않고 엔터를 쳐도 빈 문자열이 입력된 것으로 인식하고 계속 입력을 받는다.
            //이런 경우에는 입력이 비어있는 경우도 조건에 추가해서 입력받아야 한다.

            int t = Integer.parseInt(str);

            int n = (int) Math.pow(3, t);
            lineArr = new char[n]; // 3의 n개 만큼 만들어주기
            Arrays.fill(lineArr, '-');

            divide(0, n);

            for (int i = 0; i < lineArr.length; i++) {
                sb.append(lineArr[i]);

            }
            sb.append('\n');


        }
        br.close();
        System.out.println(sb);

    }

    public static void divide(int start, int length) {
        // 길이가 3보다 작으면 ( 등분이 불가능하기에 재귀 탈출 기저 조건)

        if (length <= 1) {
            return;
        }

        //3등분으로 쪼개기 위한 변수 값
        int newlength = length / 3;

        //가운데 공백(두번째 구역)으로 바꾸기
        for (int i = start + newlength; i < start + newlength * 2; i++) {
            // 조건이 3등분한 부분 중 2번째 인 곳은 다 공백으로 만들어 주기 위함
            lineArr[i] = ' ';
        }

        //첫번째 구역 쪼개기
        divide(start, newlength);

        //세번째 구역 쪼개기
        divide(start + newlength * 2, newlength);
    }
}

