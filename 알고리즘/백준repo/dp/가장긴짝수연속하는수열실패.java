package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴짝수연속하는수열실패 {
    //22857
    // 연속한 정수 수열 중 k만큼 수를 지울 수 있다 지우고 난 후 가장 긴 짝수 부분 수열을 구하자!
    // 지울 수는 홀수를 지우는 게 가장 긴 수열을 뽑아낼 수 있을 거 같고, k 번째는 짝수와 인접한 수를 지우는 게 유리하겠네..
    // 그럼 조합으로 1,2,3,4라면 4C2개를 빼는데,  홀수인 수만 빼는 조합2C2

    // 찾아보니 투포인터로 푸는 문제다 ㅠ

    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[s + 1];
        dp = new int[s + 1];

        for (int i = 1; i <= s; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        for (int i = 1; i <= s; i++) {

        }
            
    }
}
