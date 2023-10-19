package 기초1.Day08.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼0의개수 {
    //10 9 8 7 6 5 4 3 2 1
    //N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;

        while (num>=5){//5x2 쌍이 몇개 있는지가 10이 몇번 곱해졌는지임. 여기서 2가 5보다 작은수이므로 5를 기준으로 구함
            count += num/5;
            num = num/5;
        }

        System.out.println(count);
    }
}
