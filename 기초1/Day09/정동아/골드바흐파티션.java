package 기초1.Day09.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐파티션 {
    //골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
    //짝수 N을 두 소수의 합으로 나타낼 수 있는 개수를 출력
    //두개 순서만 다른건 같은 거로 취급
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int t = Integer.parseInt(br.readLine());
        boolean[]prime = new boolean[1000001]; //에라토스테네스 입력 조건

        for (int i = 2; i<=Math.sqrt(1000000); i++){ //소수 구하기
            if (prime[i]){ //소수가 아닌것들 지나감
                continue;
            }
            for (int j = i*i; j<1000001; j+=i){
                prime[j] = true;
            }
        }
        for (int i =0; i<t; i++){
            int input = Integer.parseInt(br.readLine());
            int count =0;
            for (int j =2; j<=input/2; j++){
                if (!prime[j] && !prime[input-j]){//입력받은 값에서 뺀 값도 소수면 둘다 소수임
                    count++;
                }
            }
            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
