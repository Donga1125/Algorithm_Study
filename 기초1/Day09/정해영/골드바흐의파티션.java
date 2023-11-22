package 기초1.Day09.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 골드바흐의파티션 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] bool = new boolean[1000001];
        Arrays.fill(bool, true); //bool의 기본값을 true로 변경.

        int t = Integer.parseInt(br.readLine());

        for(int i=2; i<1000001; i++){
            if(bool[i]){
                for(int j=i+i; j<1000001; j=j+i){ //j=6 j=9 j=12 j=15 ... 반복
                    bool[j] = false; //false면 소수가 아니다.
                }
            }
        }

        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j=2; j<=n/2; j++){
                if(bool[j] && bool[n-j]) count++;
            }
            System.out.println(count);
        }
    }
}

