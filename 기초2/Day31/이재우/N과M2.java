package 기초2.Day31.이재우;

import java.io.*;

public class N과M2 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int[] arr;
    private static boolean[] visit;
    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        arr = new int[m];
        visit = new boolean[n];

        for(int i = 0 ; i < n ; i++) {
            DFS(i, 0);
        }

        bw.close();
    }

    private static void DFS(int number, int count) throws IOException {

        visit[number] = true;

        arr[count] = number + 1;

        if(m == count + 1){
            for(int i = 0 ; i < m ; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            visit[number] = false;
            return;
        }

        for(int i = number ; i < n ; i++){
            if(!visit[i]){
                DFS(i, count + 1);
            }
        }

        visit[number] = false;
    }
}
