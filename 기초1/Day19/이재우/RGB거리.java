package 기초1.Day19.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGB거리 {

    public static void main(String[] args) throws IOException {

        final int R = 0;
        final int G = 1;
        final int B = 2;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numOfHouse = Integer.parseInt(bufferedReader.readLine());
        //cost[i][R or G or B] 는 i번 째 집을 R or G or B로 칠하는 비용이 저장되는 배열
        int[][] cost = new int[numOfHouse + 1][3];
        //record[i][R or G or B] 는 i번 째 집을 R or G or B로 칠할 때 까지의 최소 누적 비용을 저장하는 배열
        int[][] record = new int[numOfHouse + 1][3];

        for(int i = 1 ; i <= numOfHouse ; i++) {
            String[] temp = bufferedReader.readLine().split(" ");
            cost[i][R] = Integer.parseInt(temp[R]);
            cost[i][G] = Integer.parseInt(temp[G]);
            cost[i][B] = Integer.parseInt(temp[B]);
        }

        for(int i = 1 ; i <= numOfHouse ; i++) {
            //i번 째 집을 R로 칠할 때 최소 누적 비용
            if(record[i - 1][G] >= record[i - 1][B]) {
                record[i][R] = record[i - 1][B] + cost[i][R];
            }
            else {
                record[i][R] = record[i - 1][G] + cost[i][R];
            }

            //i번 째 집을 G로 칠할 때 최소 누적 비용
            if(record[i - 1][R] >= record[i - 1][B]) {
                record[i][G] = record[i - 1][B] + cost[i][G];
            }
            else {
                record[i][G] = record[i - 1][R] + cost[i][G];
            }

            //i번 째 집을 B로 칠할 때 최소 누적 비용
            if(record[i - 1][R] >= record[i - 1][G]) {
                record[i][B] = record[i - 1][G] + cost[i][B];
            }
            else {
                record[i][B] = record[i - 1][R] + cost[i][B];
            }
        }

        System.out.println(findMin(record[numOfHouse][R], record[numOfHouse][G], record[numOfHouse][B]));
    }

    static int findMin(int a, int b, int c) {
        if(a <= b && a <= c) {
            return a;
        }

        if(b <= a && b <= c) {
            return b;
        }

        return c;
    }
}
