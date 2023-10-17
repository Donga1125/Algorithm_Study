package 기초1.Day06.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대공약수와최소공배수 {
    //2개의 자연수를 입력받아 최대 공약수,최소 공배수를 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int d = gdc(a,b);
        System.out.println(d);
        System.out.println(a*b /d); //최소공배수

    }

    //최대공약수 재귀
    public static int gdc(int a, int b){
        if (b == 0){
            return a;
        }
        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gdc(b,a%b);
    }
}
