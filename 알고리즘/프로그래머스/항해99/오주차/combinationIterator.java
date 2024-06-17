package 알고리즘.프로그래머스.항해99.오주차;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class combinationIterator {


//    1286. Iterator for Combination

    //String 문자열이 영어로 주어지는데, 사전 순으로 combi로 반환
    // 들어온 숫자만큼 짤라서 반환하면 됨
    // 순서 x 중복 상관 x 조합
    // 다 만들어놓고 확인이 아니라,

    //next는 다음 조합된 요소를 반환
    //hasNext는 다음 조합 요소가 있으면 t,f 반환

    int length;
    String chch;
    static StringBuilder sb;
    static List<StringBuilder> list = new ArrayList<>();
    static int now = 0;


    public static void main(String[] args) {
        String ch = "chp";
        int combi = 1;
        combinationIterator main = new combinationIterator(ch, combi);
        System.out.println(main.hasNext());
        System.out.println(main.next());
        System.out.println(main.hasNext());
        System.out.println(main.hasNext());
        System.out.println(main.next());
        System.out.println(main.next());
        System.out.println(main.hasNext());
        System.out.println(main.hasNext());
        System.out.println(main.hasNext());
    }


    public combinationIterator(String characters, int combinationLength) {
        this.length = combinationLength;
        this.chch = characters;

        for (int i = 0; i < characters.length(); i++) {

            for (int j = i +1; j <= combinationLength; j++) {
                sb = new StringBuilder();
                sb.append(characters.charAt(i)).append(characters.charAt(j));
                System.out.println("i = " + characters.charAt(i));
                System.out.println("j = " + characters.charAt(j));
                list.add(sb); // 10000번 호출 ?


            }

        }

        System.out.println(list);



    }

    public String next() {

        // 호출 시 하나씩 반환

        StringBuilder sbNext = list.get(now++);
        String next = sbNext.toString();

        return next;

    }

    public boolean hasNext() {


        if (list.size() <= now) {
            return false;
        }

        return true;



    }

}
