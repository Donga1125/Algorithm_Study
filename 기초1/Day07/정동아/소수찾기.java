package 기초1.Day07.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");

        int count=0;
        int num;
        for (int i =0; i<t; i++){
            num = Integer.parseInt(input[i]);
            for (int j =2; j<= num; j++){
                if (j == num){
                    count++;
                }
                if (num % j == 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
