package 알고리즘.백준책;

import java.io.*;
import java.util.HashMap;

public class Calender {

    static final int now = 20240124;
    static HashMap<Integer, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        bw.write("총 8자리의 연도와 달, 날짜를 입력 해주세요");
        bw.flush();

        int n = Integer.parseInt(br.readLine());

       int answer = Math.abs(now - n);

        map.put(1, "수");
        map.put(2, "목");
        map.put(3, "금");
        map.put(4, "토");


    }

}
