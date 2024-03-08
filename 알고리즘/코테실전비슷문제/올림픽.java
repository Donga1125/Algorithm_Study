package 알고리즘.코테실전비슷문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 올림픽 {
    // 생각해보니 2차원 배열을 정렬하면 될 거 같다
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int country = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[][] = new int[t][4];
        int answer[] = new int[t];

        for (int i = 0; i < t; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                int n = Integer.parseInt(st.nextToken());
                arr[i][j] = n;
                map.put(n, 0);
            }

        }
        int max = 0;

        for (int i = 0; i < t; i++) {
            for (int j = i + 1; j < t; j++) {
                answer[i] = Math.max(arr[i][1], arr[j][1]);

                }
            }
        for (int a : answer) {

            System.out.println(a);

        }
        }
    }



