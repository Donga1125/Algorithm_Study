package 기초1.Day08.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD의합 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            String[] arr = br.readLine().split(" ");

            long answer = 0;

            int n = Integer.parseInt(arr[0]);

            int[] intArr = new int[n];

            for(int j=0; j<intArr.length; j++){
                intArr[j] = Integer.parseInt(arr[j+1]);
            }

            for(int j=0; j<intArr.length-1; j++){
                for(int k= j+1; k<intArr.length; k++){
                    answer += gcd(intArr[j], intArr[k]); //모든케이스를 전부 확인한다.
                }
            }

            System.out.println(answer);
        }

        br.close();

    }

    public static int gcd(int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
