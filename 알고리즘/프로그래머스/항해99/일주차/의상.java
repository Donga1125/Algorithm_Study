package 알고리즘.프로그래머스.항해99.일주차;

import java.util.HashMap;
import java.util.Iterator;

public class 의상 {

    //가진 옷이 있고 같은 부위라면 최대 1개만, 하나라도 다르면 다른 옷이고, 최소 하나 입음

    //해쉬를 사용해서 풀자 !
    //중복은 안됨 순서가 중요하지 않음
    // ,기준으로 나눠서 저장 ? 종류가 있다면 일단 첨 넣을 때 1이고 getOrDefault로 계속 숫자 추가 ?
    private static String[][] clothes1;
    private static HashMap<String, Integer> map;

    public static void main(String[] args) {
        의상 clothes = new 의상();
        clothes1 = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}};






        clothes.solution(clothes1);

    }

    private int solution(String[][] clothes) {
        map = new HashMap<>();
        int answer = 0;
        System.out.println(clothes.length);
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);


        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
        return answer;
    }

}

