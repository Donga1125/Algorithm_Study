package 기초1.Day10.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진법변환 {
    //B진법 수 N이 주어지면 10진법으로 바꿔서 출력

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b =  Integer.parseInt(st.nextToken());

        int tmp = 1; //36^0
        int sum = 0;

        for (int i = n.length()-1; i>=0; i--){ //맨오른쪽부터 계산하기위함
            char c = n.charAt(i);

            if ('A' <= c&& c<= 'Z'){//A~Z사이면
                sum += (c - 'A' +10) *tmp;
            }else {
                sum += (c - '0') *tmp;
            }
            tmp*=b; ///36^1
        }

        System.out.println(sum);
    }
}
