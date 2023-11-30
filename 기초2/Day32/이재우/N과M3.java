package 기초2.Day32.이재우;

import java.io.*;

public class N과M3 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int[] arr;
    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        arr = new int[m];

        DFS(0);

        bw.close();
    }

    private static void DFS(int count) throws IOException {

        if(count < m) {
            for(int i = 1 ; i <= n ; i++) {
                arr[count] = i;
                DFS(count + 1);
            }
        }
        else {
            for(int i = 0 ; i < arr.length ; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
        }
    }
}
