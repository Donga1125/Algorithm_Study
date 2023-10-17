package 기초1.Day06.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최소공배수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String[] arr = br.readLine().split(" ");

            int b = Integer.parseInt(arr[0]);
            int a = Integer.parseInt(arr[1]);

            int result = a * b / gcd(a, b);
            System.out.println(result);
        }
        br.close();
    }
    static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }
}
