package 기초1.Day04.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int['z'-'a'+1];

        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        String S = br.readLine();

        for(int i=0; i<S.length(); i++){

            if(arr[S.charAt(i) - 'a'] != -1){
                continue;
            }else {
                arr[S.charAt(i) - 'a'] = i;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        br.close();
    }
}
