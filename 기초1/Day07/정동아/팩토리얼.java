package 기초1.Day07.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼 {
    //정수 N이 주어질때, N!을 출력

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result= 1;
        int input = Integer.parseInt(br.readLine());
        if (input == 0){
            System.out.println(result);
        }else {
            for (int i=1; i<=input; i++){
                result= result* i;
            }
            System.out.println(result);
        }
    }
}
