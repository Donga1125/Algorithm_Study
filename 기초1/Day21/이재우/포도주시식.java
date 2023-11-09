package 기초1.Day21.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 포도주시식 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] amount = new int[n + 1]; //포도주의 양
        int[] maximumAmount = new int[n + 1]; //n번 째 포도주 까지 주어졌을 때 최대로 마실 수 있는 양

        for(int i = 1 ; i < n + 1 ; i++) {
            amount[i] = Integer.parseInt(bufferedReader.readLine());
        }

        maximumAmount[1] = amount[1];

        if(n > 1) { //인덱스 넘어가는거 방지를 위한 if문
            maximumAmount[2] = amount[1] + amount[2];
        }

        for(int i = 3 ; i < n + 1 ; i++) { // 점화식
            maximumAmount[i] = Math.max(maximumAmount[i - 3] + amount[i - 1] + amount[i], maximumAmount[i - 2] + amount[i]);
            maximumAmount[i] = Math.max(maximumAmount[i], maximumAmount[i - 1]);
        }

        System.out.println(maximumAmount[n]);
    }
}
