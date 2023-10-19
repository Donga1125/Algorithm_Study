package 기초1.Day06.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int t = Integer.parseInt(br.readLine());
        for (int i =0; i<t; i++){
            String [] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            int d = gdc(a,b);
            sb.append(a*b /d).append('\n');
        }
        System.out.println(sb);

    }

    //최대공약수 재귀
    public static int gdc(int a, int b){
        if (b == 0){
            return a;
        }
        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gdc(b,a%b); //디버깅
    }
}
