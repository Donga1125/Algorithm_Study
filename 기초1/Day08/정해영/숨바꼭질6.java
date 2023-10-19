package 기초1.Day08.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숨바꼭질6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");

        int n = Integer.parseInt(split[0]); //동생의 수
        int subin = Integer.parseInt(split[1]); //수빈이 위치

        String[] split1 = br.readLine().split(" ");

        int res = 0;

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            //수빈이와 동생의 위치의 차를 구해준다.
            int brother = Integer.parseInt(split1[i]);
            arr[i] = Math.abs(brother-subin);
        }
        res = arr[0];

        if(n != 1){
            for(int i=1; i<n; i++){
                res = gcd(res,arr[i]);
            }
        }

        System.out.println(res);
        br.close();
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
