package 알고리즘.단계별백준.정렬;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어정렬 {
    //단어를 정렬하는데, 길이가 짧은 것부터, 같다면 알파벳순( -0 하면될듯),
    // 중복은 허용하지 않음 검사하던지 set으로 구조를 만들자
    // 문자열의 길이가 50 이 넘지 않는다는건 매우 중요하다
    // 성능이 저하될 수 있어 다른 정렬을 써야할 수 있고(삽입퀵써서) 정렬과정에서 임시 데이터 크기를 조절해야할 수도 있다

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();


        for (int i = 0; i < n; i++) {

            set.add(br.readLine());

        }

        String[] str = new String[set.size()];



        Iterator<String> iter = set.iterator();
        int i = 0;
        while (iter.hasNext()) {
            str[i] = iter.next();
            i++;
        }


        Arrays.sort(str, (e1, e2) -> {
            if (e1.length() == e2.length()) {
                // 문자열 길이가 같을 경우 사전순으로 비교
                for (int j = 0; j < e1.length(); j++) {
                    if (e1.charAt(j) != e2.charAt(j)) {
                        return e1.charAt(j) - e2.charAt(j);
                    }
                }
                // 두 문자열이 완전히 같을 경우
                return 0;
            } else {
                // 문자열 길이가 다를 경우 길이가 짧은 순으로 정렬
                return e1.length() - e2.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < set.size(); j++) {
            sb.append(str[j]).append('\n');
        }
        System.out.println(sb);

    }
}
