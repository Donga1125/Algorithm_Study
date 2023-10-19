package 기초1.Day08.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD합 {
    //양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구해라
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());


        for (int i =0; i<t; i++){
            long count = 0; //int로 선언 시 범위 초과함. 그래서 long으로 선언
            String[]input = br.readLine().split(" ");
            for (int j =1; j< input.length-1; j++){ //입력받은 문장 맨 앞은 테이트 케이스 개수임
               for (int k = j+1; k<input.length; k++){
                   long d= gcd(Integer.parseInt(input[j]), Integer.parseInt(input[k]));
                   count +=d;
               }
            }
            sb.append(count).append('\n');
        }

        System.out.println(sb);
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
