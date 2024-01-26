package 알고리즘.자바;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 두수비교1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n < m) {
            System.out.println("<");
        } else if (n > m) {
            System.out.println(">");
        } else if (n == m) {
            System.out.println("==");
        }
        br.close();

    }
}
