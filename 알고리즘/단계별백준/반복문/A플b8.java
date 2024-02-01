package 알고리즘.단계별백준.반복문;

import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;


    public class A플b8 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int answer = 0;
            int t = Integer.parseInt(br.readLine());

            for (int i = 1; i <= t; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                answer = a + b;
                System.out.println(String.format("Case #%d: %d + %d = %d", i, a, b, answer));
            }            }
        }

