package 기초1.Day05.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<arr.length; i++){
            arr[i] =st.nextToken();
        }

        String first = arr[0] + arr[1];
        String second = arr[2] + arr[3];

        System.out.print(Long.parseLong(first) + Long.parseLong(second));
        br.close();
    }
}