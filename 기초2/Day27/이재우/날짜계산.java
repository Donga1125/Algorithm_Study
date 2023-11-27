package 기초2.Day27.이재우;

import java.io.*;

public class 날짜계산 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int e = 1, s = 1, m = 1;
        int E, S, M;
        E = Integer.parseInt(input[0]);
        S = Integer.parseInt(input[1]);
        M = Integer.parseInt(input[2]);

        int idx = 1;
        while(true){
            if(e  > 15)
                e = 1;
            if(s > 28)
                s = 1;
            if(m > 19)
                m = 1;

            if(e == E && s == S && m == M)
                break;

            idx++;
            e++; s++; m++;
        }
        System.out.println(idx);
    }
}
