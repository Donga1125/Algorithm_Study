package 알고리즘.단계별백준.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 숫자카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            set.add(Integer.parseInt(st.nextToken()));

        }

        int m = Integer.parseInt(br.readLine());

        int[] check = new int[m];
        int[] hasCard = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {

            check[i] = Integer.parseInt(st.nextToken());

            if (set.contains(check[i])) {
                hasCard[i] = 1;
            }



//            for (int j = 0; j < n; j++) { // j있다면 그 수를 지워주면 성능이 올라갈 거 같긴 하다 찾는데..(시간초과)
//                if (check[i] == arr[j]) {
//                    hasCard[i] = 1;
//                }
//            }
        }



        StringBuilder sb = new StringBuilder();

        for (int k : hasCard) {
            sb.append(k).append(' ');

        }

        System.out.println(sb);

    }
}
