package 알고리즘.냅색;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.ArrayList;


//문제
//세준이는 N개의 물건을 가지고 있고, 최대 C만큼의 무게를 넣을 수 있는 가방을 하나 가지고 있다.
//
//N개의 물건을 가방에 넣는 방법의 수를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 N과 C가 주어진다. N은 30보다 작거나 같은 자연수, C는 109보다 작거나 같은 음이 아닌 정수이다.
// 둘째 줄에 물건의 무게가 주어진다. 무게도 109보다 작거나 같은 자연수이다.

//관건은 빅오 계산 n이 30개 까지 들어오면 n 당 경우의 수는 넣거나 넣지 않거나이다.
// 그럼 n마다 2가지의 경우의 수니까 2^30승이고, 10억번을 탐색 해야한다. dfs만으로는 절대 못푼다. dfs는 500~1000정도가 맥시멈
// 그래서 결론은 dfs와 binary search 섞기 배낭 1과 배낭2로 두개 만든 다음 +하자
public class Joon1450 {

    static int N, C;

    public static int binarySearch(ArrayList<Integer> sum1, int target) {
        int left = 0, right = sum1.size() - 1, mid, answer = -1; // 못찾을 경우 -1 리턴해야하니까
        while (left <= right) {
            mid = left + right / 2;
            if (sum1.get(mid) <= target) {
                answer = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
        return 0;}


    public static void main(String[] args) throws IOException {
        // 0. 입력 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 갯수
        C = Integer.parseInt(st.nextToken()); // 총 들어가는 무게

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> weight1 = new ArrayList<>();
        ArrayList<Integer> weight2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (N / 2 > i) {
                weight1.add(Integer.parseInt(st.nextToken()));

            } else weight2.add(Integer.parseInt(st.nextToken()));
        }


        // 1. dfs로 sum1,sum2 만들기

        ArrayList<Integer> sum1 = new ArrayList<>();
        ArrayList<Integer> sum2 = new ArrayList<>();

        //dfs(0, 0, weight1, sum1);
       // dfs(0, 0, weight2, sum2);


        // 2. sort 및 binarySearch 만들기
        Collections.sort(sum2);
        int answer = 0;
        for (int i = 0; i < sum1.size(); i++) {
            int searchValue = C - sum2.get(i);
            answer += binarySearch(sum2, searchValue) + 1;
        }

    }
}
