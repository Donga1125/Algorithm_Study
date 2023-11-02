package 기초1.Day16.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이친수 {
    //n자리 이친수의 총 개수를 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        long d[] = new long[count+1];

        //n번째 자리에 0이 올 땐 n-1의 숫자가 0,1 상관 없으므로 dp[n-1]만큼 정답에 +
        //1이올 때는 n-1의 자리에 무조건 0이 와야하기 때문에 dp[n-1]에서 0이 올때를 생각해서 dp[n-2]을 정답에 +
        d[0]=0;
        d[1]=1;

        for (int i =2; i<=count; i++){
            d[i] = d[i-1]+ d[i-2];
        }

        System.out.println(d[count]);
    }
}
