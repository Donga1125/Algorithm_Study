package 알고리즘.단계별백준2.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일로만들기 {

    //1463
    private static int n;
    private static int max = Integer.MAX_VALUE;




    // 3으로 나누거나 2로 나누거나 -1로 하거나 세가지 경우인데 최소여도 3부터가 아니라 다 경우의 수 따져야 함
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());


        dfs(n, 0);
        System.out.println(max);
            
    }

    private static void dfs(int n, int count) {

        if (n == 1) {

            max = Math.min(count, max);

           
            return;

        }

        for (int i = 0; i < 3; i++) {
            if (n % 3 == 0) {

                dfs(n / 3, count);

            } if (n % 2 == 0) {

                dfs(n / 2, count + 1);
            } if(n % 2 != 0 && n % 3 != 0)
                dfs(n - 1, count + 1);

        }







            }



    }

