package 기초1.Day07.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 골드바흐의추측 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] bool = new boolean[1000001];
        Arrays.fill(bool, true); //bool의 기본값을 true로 변경.

        for(int i=3; i<1000001; i++){
            if(bool[i]){
                for(int j=i+i; j<1000001; j=j+i){ //j=6 j=9 j=12 j=15 ... 반복
                    bool[j] = false; //
                }
            }
        }

        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            int count = 0;

            for(int i=3; i<1000001; i++){
                if(bool[i] && bool[n-i]){
                    System.out.println(n + " = " + i + " + " + (n-i));
                    count = 1;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
