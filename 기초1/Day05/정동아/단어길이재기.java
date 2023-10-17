package 기초1.Day05.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어길이재기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split("");
        int count= 0;
        for(int i =0; i< input.length; i++){
            count++;
        }

        System.out.println(count);
    }
}
