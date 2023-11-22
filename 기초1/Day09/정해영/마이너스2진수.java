package 기초1.Day09.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 마이너스2진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        if(n == 0){
            System.out.println(0);
        }else {
            while (n != 0){
                int remainder = n % -2;
                n /= -2;

                if(remainder < 0){ //나머지가 0보다 작으면
                    remainder += 2; //나머지 + 2
                    n++; //몫 + 1
                }

                sb.insert(0,remainder);
            }

            System.out.println(sb);
        }

    }
}