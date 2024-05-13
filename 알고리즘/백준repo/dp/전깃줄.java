package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 전깃줄 {
    //2565

    //서로 전깃줄이 연결되어 있는데 교차되지 않는 최소의 수를 제거하자 많이 얽혀있는 거 위주로일듯)
    // 같은 위치를 잇는 건 없고 위치 번호는 500개 이하,전기줄의 갯수는 총 100개다
    // 2차원 배열로 해도 될 거 같은데 직관적이지 않다
    private static int[] arr1 = new int[501];
    private static int[] arr2 = new int[501];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st.nextToken());


        }

    }
}
