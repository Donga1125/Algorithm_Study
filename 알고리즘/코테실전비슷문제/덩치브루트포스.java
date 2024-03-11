package 알고리즘.코테실전비슷문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 덩치브루트포스 {
    // 정렬할 필요도 없고 그냥 브루트포스로 찾으면서 현재 수만 비교해서 랭크로 반환하는 문제였는데
    // 정렬하고, 순서 정하고 헛짓거리 다 했다..

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int arr[][] = new int[t][2];
        StringBuilder sb = new StringBuilder();



        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < t; i++) {
            int rank = 1;

            for (int j = 0; j < t; j++) {
                if (i == j) {
                    continue;

                }
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }

            sb.append(rank).append(" ");

            }

        System.out.println(sb);
        }
    }


