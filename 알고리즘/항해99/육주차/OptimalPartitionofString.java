package 알고리즘.항해99.육주차;

import java.util.HashMap;

public class OptimalPartitionofString {

    //2405. Optimal Partition of String

    //주어진 s의 서브 스트링을 구성하는데, 중복된 char가 없게 만들어야 한다
    // 최소의 subString 갯수를 반환
    // "abacaba" 라면 "ab" "ac" ,"aba"로 나눴다면  aba에 a가 2개라 안됨
    // s = abacaba 라면 앞에서부터 시작해서 있는 수 중 같은 수가 들어오면 그전까지 담기 ?
    // 각 substring은 중복되도 되는 듯 ? 이걸 안 적어주니 헷갈리네


    public static void main(String[] args) {

        String s = "abacaba";
        OptimalPartitionofString main = new OptimalPartitionofString();
        System.out.println(main.partitionString(s));
    }
    public int partitionString(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);
            //현재 current가
            // map에 없으면 넣고 다음수
            // map에 있다면 count++해주고, map을 초기화하고 다시 담기
            if (!map.containsKey(current)) {
                map.put(current, 1);

            } else {
                count++;
                map = new HashMap<>();
                map.put(current, 1);
            }
        }

        return count +1; // 마지막 subString이 하나 남아있으니 그 수 +1

    }

}
