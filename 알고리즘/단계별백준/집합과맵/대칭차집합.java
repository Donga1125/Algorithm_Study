package 알고리즘.단계별백준.집합과맵;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 대칭차집합 {

    // a-b의 개수와 b-a의 개수를 합쳐서 반환하는데 두개의 set을 만들면 되지 않을까 ?

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        HashMap<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int s = Integer.parseInt(st.nextToken());
            map.put(s, 1);

        }
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int s = Integer.parseInt(st.nextToken());
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count = 0;

        for (int s : map.keySet()) {
            if (map.get(s).equals(1)) {
                count++;
            }

        }

        System.out.println(count);


    }


}
