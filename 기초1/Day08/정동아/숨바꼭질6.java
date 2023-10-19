package 기초1.Day08.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숨바꼭질6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] numArray = new int[n];
        for (int i = 0; st.hasMoreTokens(); i++) {
            numArray[i] = Math.abs(Integer.parseInt(st.nextToken()) - s); //수빈이와 동생 사이의 거리를 절대값으로 구함
        }
        int d = numArray[0];
        for (int i = 0; i < n; i++) {
            d = gcd(d, numArray[i]); //구한 거리들의 최대 공약수를 구해준다. 
        }

        System.out.println(d);
    }

    //최대공약수 재귀
    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gcd(b,a%b);
    }
}
