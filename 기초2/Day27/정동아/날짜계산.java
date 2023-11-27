package 기초2.Day27.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 날짜계산 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // E S M 입력 받기
        int inputE = Integer.parseInt(st.nextToken());
        int inputS = Integer.parseInt(st.nextToken());
        int inputM = Integer.parseInt(st.nextToken());

        int e = 1;
        int s = 1;
        int m = 1;
        int count = 1;


        while (true){
            if (e >15){// 범위가 넘어가면 다시 1에서 카운트하도록
                e =1;
            }
            if (s >28){
                s =1;
            }
            if (m >19){
                m = 1;
            }
            if (e == inputE && s == inputS && m == inputM){ //셋다 같으면 원하는 답임
                break;
            }

            e++;
            s++;
            m++;
            count++;

        }

        System.out.println(count);
    }
}
