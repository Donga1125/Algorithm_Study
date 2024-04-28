package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드구매하기 {

    static int[] card;

    //카드 갯수n  1,2,3,4 있고 금액으로 배열저장하는데 n개를 사면서 금액이 가장 큰 걸 반환
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        card = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            card[i] = Integer.parseInt(st.nextToken());

        }
            
    }
}
