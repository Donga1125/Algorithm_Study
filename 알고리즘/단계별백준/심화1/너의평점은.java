package 알고리즘.단계별백준.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 너의평점은 {

    //수업명, 학점, 과목 평점이 들어오는데 계산 방식은 학점 x 과목평점을 학점총합으로 나누기
    String arr[] = {"A+", "A0", "B+", "B0"};
    static HashMap<String, Double> map = new HashMap<>();

    public static void main(String[] args) throws IOException {

        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
        double sum = 0.0;
        int count = 0;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String n = st.nextToken();
            double d = Double.parseDouble(st.nextToken());
            String g = st.nextToken();
            if (!g.equals("P")) {
                sum += d * map.get(g);
                count += d;

            }
        }

        double av = sum / count;
        System.out.println(av);

    }
}
