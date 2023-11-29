package 기초2.Day33.이재우;

import java.io.*;
import java.util.Arrays;

public class N과M6 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int[] arr;
    private static int[] answer;
    private static boolean[] visit;
    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        arr = new int[n];
        answer = new int[m];
        visit = new boolean[n];

        String[] strArr = br.readLine().split(" ");
        for(int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(arr);

        DFS(0, 0);

        bw.close();
    }

    private static void DFS(int number ,int count) throws IOException {

        if(count == m) {
            for(int i = 0 ; i < answer.length ; i++) {
                bw.write(answer[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i = number ; i < n ; i++) {
            if(!visit[i]) {
                visit[i] = true;
                answer[count] = arr[i];
                DFS(i, count + 1);
                visit[i] = false;
            }
        }
    }
}
