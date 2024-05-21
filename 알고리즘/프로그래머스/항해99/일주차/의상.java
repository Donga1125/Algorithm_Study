package 알고리즘.프로그래머스.항해99.일주차;

import java.util.HashMap;
import java.util.Iterator;

public class 의상 {

//    가진 옷이 있고 같은 부위라면 최대 1개만, 하나라도 다르면 다른 옷이고, 최소 하나 입음
//
//    해쉬를 사용해서 풀자 !
//    중복은 안됨 순서가 중요하지 않음
//     ,기준으로 나눠서 저장 ? 종류가 있다면 일단 첨 넣을 때 1이고 getOrDefault로 계속 숫자 추가 ?
//     순열 조합 이용해서 마지막에 다 선택된 경우까지 계산되니까 -1 해주면 되겠다
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
        int answer = 1;

        for (int i = 0; i < clothes.length; i++) {

            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
            // 조합을 구하는 경우에서 안입은 걸 안 더해줬다 예제의 경우 e= 1 h=2 로 했는데 이러면 안되고
            // 안쓰는 경우인 e = 2, h=3으로 구해야한다

        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            answer *= (int) it.next() + 1;

        }

        return answer -1; // 아무것도 안 입은 경우를 뺴준다
    }

    private static int combination(int n, int r) {
        if(n == r || r == 0)
            return 1;
        else
            return combination(n - 1, r - 1) + combination(n - 1, r);
    }

}

