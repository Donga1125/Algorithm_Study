package 알고리즘.단계별백준.시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시간복잡도5 {

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            long n = Long.parseLong(br.readLine());
            br.close();

            int count = 0; //수행 홧수 저장하는 변수

            for(int i  = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    for(int k = 1; k <= n; k++){
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
}}
