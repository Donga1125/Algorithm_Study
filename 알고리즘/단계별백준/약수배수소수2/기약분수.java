package 알고리즘.단계별백준.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 기약분수 {

    // 분모 분자 주어 졌을 때 약분 가능하면 약분부터 다 하고 약분이 안될 시 분모 곱 해서 더해주기
    // 최소 공배수 구해줘야 한다..


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int gcd = gcd(a2, b2); //gcd에 분자 최소공배수 구하기

        int bottom = (a2 * b2) / gcd;

//        int up = (a1 * gcd) + (b1 * gcd);
        int up2 = (a1 * (bottom / a2)) + (b1 * (bottom / b2));

//        System.out.println(up2 + " " + bottom);


        int divisor = gcd(up2, bottom); // 최대 공약수를 구하고 그다음 그 수로 나눠주면 기약분수가 됨

        System.out.println(up2 / divisor + " " + bottom / divisor);



    }
    public static int gcd(int a , int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
