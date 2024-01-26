package 알고리즘.개발자취업하기.위장;

import java.util.HashMap;
import java.util.Iterator;

// 매일 다른 옷 입도록 조합을 해야한다. 여러가진 옷들을 가지고 몇가지의 위장을 할 수 있는  ?
// clothes의 각 행 의상의 이름, 종류로 나눠져있다.
// 1개 이상 30 이고 같은 의상은 존재하지 않는다.
// 모든 문자열의 길이1이상 20이하인 자연수고, 알파벳소문 또는 '_'로 이루어져 있다.
// 스파이는 최소 하루에 하나 이상은 무조건 입는다 (암 것도 안 입는 건 안되고, 각 종류대로 다 안입어도 됨)


// 옷을 종류 별로 구분하 몇개의 조합이 가능한 지 ? 종류 별로 몇가지의 옷을 셀 수 있을 때 총 조합의 수를 계산할 떈 Hash

public class SolutionHash {
    public int solution(String[][] clothes) {

        // 1. 옷을 종류 별로 구분한다.
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 1) + 1); // 여기까진 none 경우를 추가하지 않음
            // defaultValue를 안 입는 것도 추가해줬다.
            // map.getOrDefault는 동일key값이 추가되면 value 값이 덮어씌여진다.
        }
        // 2. 하나 또는 모두 입지 않는 경우를 추가해 모든 조합을 계산한다.
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while (it.hasNext()) {
            answer *= it.next().intValue(); // intValues는 지금 Integer 값이니 산수하기 위해
            // + 1는 입지 않는 경우를 하나 추가해준 것
        }
        // 3. 모두 입지 않는 경우는 빼준다.
        return answer -1 ; // -1은 둘다 안입은 경우가 하나니까
    }

    public static void main(String[] args) {
        SolutionHash sol = new SolutionHash();
        String[][] clothes = {{"yellohat", "headgear"},
                             {"bluesunglasses", "eyewear"},
                             {"green_turban", "headgear"}};

        System.out.println(sol.solution(clothes));

    }
}
