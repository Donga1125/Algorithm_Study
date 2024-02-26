package 알고리즘.단계별백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 좌표압축 {

    // 낮은 값이 더 높은 우선순위를 갖고 중복이 허용된다. 먼저 정렬을 해 우선순위를 부여하고
    // 그럼 그 우선 순위를 map으로 만들어 나중에 하나씩 대입해서 꺼내오자

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] sorted = new int[n];

        HashMap<Integer, Integer> rankMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());


        for (int i = 0; i < n; i++) {

            arr[i] = sorted[i] = Integer.parseInt(st.nextToken()); // 기존 배열과 정렬된 배열 생성
        }

        Arrays.sort(sorted);
        int rank = 0;

        for (int v : sorted) {
            if(!rankMap.containsKey(v)) {// 중복이 있으니까 넣어진 키가 없다면 넣어주고 (중복제거) rank로 순서를 메기기
                rankMap.put(v, rank);
                rank++;

        }
    }

        StringBuilder sb = new StringBuilder();
        for (int key : arr) {
            int ranking = rankMap.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);

        }

}
