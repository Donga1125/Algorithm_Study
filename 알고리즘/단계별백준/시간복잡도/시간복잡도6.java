package 알고리즘.단계별백준.시간복잡도;

import java.io.*;

public class 시간복잡도6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        int count = 0;

        for(int i = 1; i <= n-2; i++){
            for(int j = i+1; j <= n-1; j++){
                for(int k = j+1; k <= n; k++){
                    count++;
                }
            }
        }

        br.close();

        bw.write(count+"\n" + 3);
        bw.flush();
        bw.close();

    }
}
