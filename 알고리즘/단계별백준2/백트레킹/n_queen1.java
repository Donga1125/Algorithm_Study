package 알고리즘.단계별백준2.백트레킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_queen1 {

    private static int t;
    private static int count;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        arr = new int[t];
        // 1차원으로 해결 가능한 게 인덱스와 그 값으로 행 열을 구분한다.. 이거 생각 첨에 어떻게 함..

        backTracking(0);

        System.out.println(count);


    }

    private static void backTracking(int depth) {



        if (depth == t) {
            count++;

            return;
        }

        for (int i = 0; i < t; i++) {

            arr[depth] = i; // depth가 행일 때 인덱스가 행으로 생각하고 열이 그 값이라고 생각하면 1차원 배열로 해결 가능하다

            if (possible(depth)) {
                backTracking(depth + 1);

            }

        }
    }

    private static boolean possible(int col) {

        for (int i = 0; i < col; i++) {

            if (arr[col] == arr[i]) { // 같은 행이라면 바로 false
                return false;

            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                //절대 값으로 열 행의 차 같으면 대각선이다.. 이거 생각하기 어려워
                return false;

            }

        }
        return true;

    }
}
