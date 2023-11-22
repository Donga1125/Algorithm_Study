package 기초1.Day04.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알파벳개수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = new int['z'-'a' + 1];

        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i) - 'a']++;
        }

        Arrays.stream(arr).forEach(a -> System.out.printf("%d ", a));
        br.close();
    }
}
