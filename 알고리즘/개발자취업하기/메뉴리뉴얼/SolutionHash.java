package 알고리즘.개발자취업하기.메뉴리뉴얼;

import java.util.*;

// 가장 많이 주문했던 단품을 코스로 리뉴얼하고 싶다
// 코스 요리는 최소 2가지 이상 단품메뉴,  2명 이상 주문한 단품메뉴조합만 후보에 포함
// order 배열의 크기는2-20이하, 문자열은 2이상10이하의 알파벳대문자, 중복 x
// course 배열의 크기는 1-이상 10이하, 원소 2이상10이하 자연수 오름차순 중복x
// 정답은 배열에 담아 오름차순으로 리턴하고 여러 개라면 전부 다 리턴


// 순서가 중요하지 않아 정렬하자, wx와 xw 다른 조합이라면 ? 정렬하면 안되고, 아니니까 정렬을 하자
//  조합을 만들 땐 순서가 중요하지 않다면 정렬을 고려해보자!
// hashmap 기본 형태는 이름:카운터 형태 기본적으로 key는 이름을 줄꺼고, value는 카운트를 줄거다.
// 예시 xy 라는 조합이 2개 존재한다.
// 재귀함수를 짤 땐 탈출동작과 수행동작을 고려하자
public class SolutionHash {

    List<String> answerList = new ArrayList<>();
    // 3단계의 과정에서 answer 배열에 담기 어렵기 때문에 List형태로 만들어서 담기 ( 계쏙 add 해주는 형식)
    HashMap<String, Integer> map = new HashMap<>();

    public String[] solution(String[] orders, int[] course) {
        // 1. 각 오더를 정렬
        for (int i = 0; i < orders.length; i++) {
            char[] arr = orders[i].toCharArray(); //string 배열 자체를 정렬할 수 없기에 char배열
            Arrays.sort(arr); // 정렬하기
            orders[i] = String.valueOf(arr); // 정렬 후 다시 i에다가 arr 담아주기
        }


        // 2. 각 오더 기준으로 courselength만큼의 조합 만들기
        for (int courseLength : course) {
            for (String order : orders)
                combination("", order, courseLength);

        // 3.가장 많은 조합을 answer에 저장
            if (!map.isEmpty()) { //콤비네이션 map의 조합이 하나라도 만들어졌다면
                List<Integer> countList = new ArrayList<>(map.values()); // 해쉬맵의 밸류로 리스트를 만드는 이유는 max값찾기 쉬움
                int max = Collections.max(countList); // 최대 값만 담아주기

                if(max > 1) // 2 이상의 조합만 유효하다.
                    for (String key : map.keySet()) //각각의 해시맵의 값들을 다 꺼내와
                     if(map.get(key) == max) //그 값이 max와 같으면
                        answerList.add(key); // 앤서리스트에 담아주기
                map.clear();
            }
        }
        Collections.sort(answerList);

        String[] answer = new String[answerList.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = answerList.get(i);

        return answer;
    }

    // order는 현재까지의 조합된 코스를 의미, others는 아직 사용되지 않은 알파벳,count는 몇개를 더 조합해야 하는지
    // 그래서 첫 오더는 emptyString으로 올것이다.
    public void combination(String order, String others, int count) {
        // 탈출조건 : count == 0
        if (count == 0) {
            map.put(order, map.getOrDefault(order, 0) + 1);
        }
        // 수행동작 : 0부터 length까 조합
        for (int i = 0; i < others.length(); i++)
            combination(order + others.charAt(i), others.substring(i + 1),count-1);

    }

    public static void main(String[] args) {
        SolutionHash sol = new SolutionHash();
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};
        System.out.println(sol.solution(orders, course));

    }
}
