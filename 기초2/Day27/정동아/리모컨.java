package 기초2.Day27.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 리모컨 {
    //현재 번호 (100) 에서 + - 로만 움질일 경우
    // 최대 근사치까지 누르고 + - 이용해서 움직일 경우

    static boolean [] broken;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        broken = new boolean[10];

        if (M != 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i =0; i<M; i++){
                int num = Integer.parseInt(st.nextToken());
                broken[num] = true;
            }
        }

        //+ - 만 누르는 경우
        int min = Math.abs(N -100);
        //숫자 버튼 누르는 경우
        for (int i = 0; i<=1000000; i++){
            int len = check(i);
            if (len >0){
                int press = Math.abs(N-i); // +- 버튼 누르는 횟수
                min = Math.min(min, len+press); //최소 이동 횟수 계산
            }
        }

        System.out.println(min);
    }

    static int check (int n){
        if (n ==0){
            if (broken[0]){
                return 0;
            }else {
                return 1;
            }
        }

        int len =0;

        while (n >0){
            if (broken[n%10]){ //고장난 버튼이 있으면
                return 0;
            }
            n /= 10;
            len ++; //숫자 버튼 누르는 횟수 추가
        }

        return len;
    }
}
