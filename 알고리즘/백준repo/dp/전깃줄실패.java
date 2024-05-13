package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 전깃줄실패 {
    //2565

    //서로 전깃줄이 연결되어 있는데 교차되지 않는 최소의 수를 제거하자 많이 얽혀있는 거 위주로일듯 (아닐 수 있다
    // 많이 얽혀 있는 걸 어떻게 알까 ? 일단 얽힌 건 얽혀있는 수 1보다 크거나,2보다 작은 경우 or 1보다 작거나 2보다 큰 경우면 얽혀있다
    // 1 1 이면 하나인데 2개면 2가지이ㅡ 경우 이렇게 접근 ?
    // 같은 위치를 잇는 건 없고 위치 번호는 500개 이하,전기줄의 갯수는 총 100개다
    // 2차원 배열로 해도 될 거 같은데 직관적이지 않다
    private static int[] arr1 = new int[501];
    private static int[] arr2 = new int[501];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr1[i] = Integer.parseInt(st.nextToken()); // 두개로 할 필요가 없지 않을까 ?
            arr2[i] = Integer.parseInt(st.nextToken());



        }

        for (int i = 1; i <= 8; i++) {
            for (int j = 0; j < 8; j++) {
                
            }
        }

    }
}
