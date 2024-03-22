package 알고리즘.백준강의;

import javax.swing.text.html.ListView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로또 {

    private static int[] arr;
    private static int[] answer;
    private static boolean[] answerCheck;
    private final static int select = 6;
    private static StringBuilder sb;
    //6603

    // for문 만드는 과정이 제일 어려웠다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();
            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];
            answer = new int[select];
            answerCheck = new boolean[n];

            if (n == 0) {
                return;
            }

            for (int i = 0; i < n; i++) {

                arr[i] = Integer.parseInt(st.nextToken());


            }

            backTracking(0,0);
            System.out.println(sb);

        }
    }

    private static void backTracking(int dp, int depth) { //dp 넘겨줌으로 순열이 아닌 조합 (중복없는)

        if (depth == select) {

            for (int val : answer) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;

        }

        for (int i = dp; i < arr.length; i++) {

                if (!answerCheck[i]) {
                    answerCheck[i] = true;
                    answer[depth] = arr[i];

                    backTracking(i,depth + 1);
                    answerCheck[i] = false;
                }


        }
    }
}