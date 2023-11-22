package 기초1.Day06.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대공약수와최소공배수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        //최대공약수(gcd) 최소공배수(lcm)
        int gcd = gcd(a, b);
        int lcm = lcm(a,b,gcd);

        System.out.println(gcd);
        System.out.println(lcm);

        br.close();
    }

    static int gcd(int a, int b){

        if(b == 0){
            return a;
        }

        return gcd(b, a % b);
    }

    static int lcm(int a, int b, int gcd){

        int result = a*b;

        return result / gcd;
    }
}
