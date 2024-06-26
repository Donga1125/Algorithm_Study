package 알고리즘.항해99.오주차;

import java.util.*;


public class sortCharactersByFrequency {

    //주어진 s를 나타나는 빈도수에 대해 내림차순으로 반환
    //같은 수의 빈도라면 위치 상관 x , 붙어있어야 함

    //50만 들어오고, 소문자 대문자 둘다 들어옴

    //문자를 돌면서 숫자를 세기 ? 그 후 객체로 비교 해서 정렬compator
    //map에 저장하고, 그 빈도수로 찾으면 더 편할듯 ?
    //map에 키로 그 char 넣고, value로 빈도를 넣음
    //밸류 값으로 내림순 정렬 후 그 키 그대로 반환





    public static void main(String[] args) {
        String s = "tree";

        sortCharactersByFrequency main = new sortCharactersByFrequency();
        System.out.println(main.frequencySort(s));

    }
    // 돌면서 하나씩 다 넣는데 똑같은 걸 만나면 하나 더 넣고
    //

    public String frequencySort(String s) {

        HashMap<Character, Integer> map1 = new HashMap<>();


        StringBuilder sb = new StringBuilder();



        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            map1.put(now, map1.getOrDefault(now, 0) + 1);


        }





        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>( // 우선순위 큐 사용
                (a, b) -> b.getValue() - a.getValue()
        );
        maxHeap.addAll(map1.entrySet());

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                sb.append(c);

            }

        }

//        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map1.entrySet()); // 일반적인 리스트 사용
//
//
//
//        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
//
//
//        for (Map.Entry<Character, Integer> entry : list) {
//            char key = entry.getKey();
//            int count = entry.getValue();
//            for (int i = 0; i < count; i++) {
//                sb.append(key);
//            }
//        }


        return sb.toString();
    }
}
