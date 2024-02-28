package 알고리즘.단계별백준.집합과맵;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 듣보잡 {

    //듣지도 못한 사람과 보지도 못한사람이 중복되면 출력인데 사전 순

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n + m; i++) {
            String s  = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        ArrayList <String> list = new ArrayList();

        for (String key : map.keySet()) {
            if (map.get(key).equals(2)) {
                list.add(key);
            }
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append('\n');

        for (String values : list) {
            sb.append(values).append('\n');

        }

        System.out.println(sb);

        
    }
}
