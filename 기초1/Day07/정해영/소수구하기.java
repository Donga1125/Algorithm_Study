package 기초1.Day07.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기 {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        //소수인지 아닌지 판단하여 저장한다. 배열생성시 디폴트는 false다.
        prime = new boolean[n + 1];

        getPrime();

        for (int i=m; i<=n; i++){
            if(!prime[i]) System.out.println(i);
        }

        br.close();
    }

    private static void getPrime() {
        //true : 소수 아님, false : 소수
        prime[0] = prime[1] = true;

        for (int i=2; i<= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j= i*i; j<prime.length; j+=i){
                prime[j] = true;
            }
        }
    }
}
