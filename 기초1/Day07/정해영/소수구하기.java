package 기초1.Day07.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i=m; i<=n; i++){
            for(int j=2; j<=i; j++){
                if(j == i) { //자기자신까지와서 나눠지면 출력하고 다음숫자로
                    System.out.println(j);
                    break;
                }
                else if (i % j != 0) { //나눠서 0이 아니면 계속진행
                    continue;
                }else break; //자기자신이외의 것으로 나눠지면 출력하지않고 종료함
            }

        }

        br.close();
    }
}
