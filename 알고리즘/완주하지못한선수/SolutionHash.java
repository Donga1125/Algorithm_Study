package 알고리즘.완주하지못한선수;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// 한 선수만 완주를 못했다. 그 선수를 찾 참여자들이 part, 완주자들이 comp
// 1명 이상 100,000명 이 comp의 길이가 part의 길이보다 1 작다.(1명만 완주 못함)
// 참가 이름은 1개 이 20개 이하의 소문자로 구성
// 참가자 중 동명이인이 존재 가 (즉 동명이인인 홍길동이 완주를 못하면 1번길동인지 2번길동인지 상관 x 길동 한명만 빠지면 됨)
 class SolutionHash {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // Hash 방법
        // 1. Hash Map을 만든다.(participant)
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
            // 밸류 값으로는 1을 하나씩 더해주는데 동명이인이 있을 수 있으니
            //map.getOrDefault(키,밸)로 전에 플레이어 이름이 있다면 가져와서  밸류에 1을 더해서 추가해 2
            // 없다면 그냥 밸류에 1을 추가하는 거

        // 즉 Key인 player가 존재했다 기존에 value값인1을 가져오고, 없다면 0을 넣음


        // 2. Hash Map을 뺀다. (completion)
        for (String player : completion)
            map.put(player, map.get(player) - 1); // 플레이어의 값을 꺼내오면 밸류가 찍힘
            //기존 값을 가져와서 -1을 해주면 0이 되는데, 0이 아닌 값의 사람이 완주 못한거다


        // 3. 남은 value가 0이 아닌 사람을 찾는다. keySet활용하기
        //System.out.println("map.keySet() = " + map.keySet());
        //map이 가지고 있는 key들을 배열로 담아주는 것

//        for (String key : map.keySet()) {
//            if (map.get(key)!= 0) {
//                answer = key;
//                break; // 끝까지 돌 필요가 없다 맞으면 바로 나와서 리
//            }
        // 엔트리셋을 활용한 이터레이터
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }



        return answer;

    }

    // 2개의 방법 sorting Loop 활용해서 풀기 or Hash 쓰기

    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden", "kiki"};
        String[] comp = {"eden", "kiki"};
        SolutionHash sol = new SolutionHash();
        System.out.println(sol.solution(part, comp));
    }

}
