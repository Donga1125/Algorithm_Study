package 기초1.Day07.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 골드바흐의추측 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        boolean[] isPrime = new boolean[1000001];
        isPrime[0] = isPrime[1] = true;
        // 배수는 prime이 아니므로 true
        // 소수는 false
        for (int i = 2; i < isPrime.length; i++) {
            if (!isPrime[i]) {
                for (int j = i + i; j < isPrime.length; j += i) {
                    isPrime[j] = true; // 소수가 아님
                }
            }
        }

        while (true) {// 입력이 종료되면 루프를 종료하기위해 사용
            int t = Integer.parseInt(br.readLine());
            boolean ans = false;
            if (t == 0){
                break;
            }
            for (int i =2; i<=t/2; i++){
                if (!isPrime[i] && !isPrime[t-1]){
                    sb.append(t+"="+i+"+"+(t-1)).append('\n');
                    ans=true;
                    break;
                }
            }
            if ( ans = false){
                sb.append("Goldbach's conjecture is wrong.").append('\n');
            }

        }
        System.out.println(sb);
    }
}
