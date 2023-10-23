package 기초1.Day10.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진법변환2 {
    //10진법수 N을 B진법으로 바꿔 출력
    //10진법을 넘어가는 수는 A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35 알파벳대문자로 표현

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (n != 0){
            if (n%b >= 10){
                sb.append((char) (n%b - 10 +'A')); //나머지가 10 이상이면 문자 출력
            }else {
                sb.append((char)( n%b + '0')); //10 미만이면 숫자 출력
            }
            n /= b;
        }

        System.out.println(sb.reverse()); //뒤집어서 출력

    }

}
