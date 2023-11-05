package 기초1.Day08.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 조합0의개수 {
    //조합의 끝자리 0의 개수 출력
    //조합 공식 = n!/(n-r)! r!
    // 25 24 23 22 ....
    //(13 12 11 10) 12 11 10 9 8
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int m = Integer.parseInt(st.nextToken()); //25
        int n = Integer.parseInt(st.nextToken()); //12

        //5와 2의 승수를 구한다.
        long count5 = five_n(m) - five_n(m-n) - five_n(n);
        long count2 = two_n(m) - two_n(m-n) - two_n(n);

        System.out.println(Math.min(count5,count2));

    }

    //5의 승수를 구하는 함수
    static long five_n(long num){
        int count = 0;
        while (num>= 5){
            count += (num/5);
            num/=5;
        }
        return count;
    }

    //2의 승수를 구하는 함수
    static long two_n(long num){
        int count =0;
        while (num>= 2){
            count += (num/2);
            num /= 2;
        }
        return count;
    }
}
