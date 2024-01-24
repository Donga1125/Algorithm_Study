package 알고리즘.패션왕신해빈;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;


//문제
//해빈이는 패션에 매우 민감해서 한번 입었던 옷들의 조합을 절대 다시 입지 않는다.
// 예를 들어 오늘 해빈이가 안경, 코트, 상의, 신발을 입었다면, 다음날은 바지를 추가로 입거나 안경대신 렌즈를 착용하거나 해야한다.
// 해빈이가 가진 의상들이 주어졌을때 과연 해빈이는 알몸이 아닌 상태로 며칠동안 밖에 돌아다닐 수 있을까?

//입력
//첫째 줄에 테스트 케이스가 주어진다. 테스트 케이스는 최대 100이다.

//각 테스트 케이스의 첫째 줄에는 해빈이가 가진 의상의 수 n(0 ≤ n ≤ 30)이 주어진다.
//다음 n개에는 해빈이가 가진 의상의 이름과 의상의 종류가 공백으로 구분되어 주어진다. 같은 종류의 의상은 하나만 입을 수 있다.
//모든 문자열은 1이상 20이하의 알파벳 소문자로 이루어져있으며 같은 이름을 가진 의상은 존재하지 않는다.

public class Joon9375 {

    static int T;
    static int N;



// 문제에서 가장 중요한 건 경우의 수다 종류에 따라 달라짐 그래서 종류 별로 옷이 몇가지 있는 지 알아야함

    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());





        for (int t = 0; t < T; t++) {
            // 1. n개의 옷 입력받기
            N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); // 옷의 이름을 이렇게 그냥 버려버리기! (나는 나눴는데..)
                String type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int answer = 1;
            for (int val :
                    map.values())
                answer *= val + 1;

            bw.write(String.valueOf(answer - 1));
            bw.newLine(); // 줄바꿈

        }
        bw.flush(); // 비우기
        br.close();
        bw.close();

    }
}

