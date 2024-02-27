package 알고리즘.단계별백준.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 나는야포켓몬마스터이다솜 {
    // 문제 개 읽기 싫게 만들었다..
    // n이 주어지면 그 숫자에 맞게 저정해서 번호면 이름 반환 이름이면 번호 반환하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 키 밸류로도 뽑을 수 있지만 오래 걸리니까 그냥 두개 다 저장

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            map1.put(s, i); // string으로 하나
            map2.put(i, s); // 숫자로 하나 따로 저장

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (49 <= s.charAt(0) && s.charAt(0) <= 57) { // 여기 안에 포함되면 숫자의 아스키코드다
                sb.append(map2.get(Integer.parseInt(s))).append('\n');

            } else
                sb.append(map1.get(s)).append('\n');

        }

        System.out.println(sb);


    }
}
