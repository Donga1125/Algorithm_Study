package 알고리즘.단계별백준2.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합틀림 {

    private static int[] arr;

    private static int t;

    //1912 연속합

    // 먼저 배열의 하나씩 돌다가
    // 넘여줄 땐 배열에서 현재 수 보다 다음 수가 더 크다면 계속 확인해서 넘어가는
    // 완벽하게 잘못 생각했다

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[t];

        for (int i = 0; i < t; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

        }
        dp(0, 0);

        System.out.println();
    }

    private static void dp(int index, int max) {


        if (index == t) {



        }

        for (int i = index; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {

                max = arr[i] + max;
                dp(index + 1, max);

            }

        }
    }
}
