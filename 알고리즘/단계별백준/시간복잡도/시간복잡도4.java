package 알고리즘.단계별백준.시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시간복잡도4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0; //수행 횟수를 저장하는 변수

        for(int i = 1; i <= n-1; i++){
            for(int j = i+1;  j <= n; j++){
                count++;
            }
        }

        System.out.println(count);

    }
}
