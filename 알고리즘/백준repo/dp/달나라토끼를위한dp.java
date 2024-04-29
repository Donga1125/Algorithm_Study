package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달나라토끼를위한dp {
    //17212
    // 동전종류는 1 2 5 7고, 최소의 동전으로 지불할 수 있게 만들자
    private static int[] coin = {7, 5, 2, 1};
    private static int[] dp;
    private static int count;
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
         StringBuilder sb = new StringBuilder();
         dp = new int[100001];
         count = 0;
         if (t == 0) {
             System.out.println(0);
         }

         for (int i = 0; i < 4; i++) {
             if (t >= coin[i]) {
                 count = count + (t / coin[i]);
                 t = t % coin[i];
             }
         }
         System.out.println(count);






    }
}
