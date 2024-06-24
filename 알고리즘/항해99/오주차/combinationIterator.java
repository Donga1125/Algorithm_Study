package 알고리즘.항해99.오주차;

import java.util.ArrayList;
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
    static List<String> list = new ArrayList<>();
    static int now = 0;
    static List<String> la = new ArrayList<>();


    public static void main(String[] args) {
        String ch = "chp";
        int combi = 1;
        String test = "abc";
        int comm = 2;
        combinationIterator main = new combinationIterator(ch, combi);
//        combinationIterator main = new combinationIterator(test, comm);
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

            if (length == 1) {

                list.add(String.valueOf(characters.charAt(i)));
            } else {

            sb = new StringBuilder();
            sb.append(characters.charAt(i));


            for (int j = i+1; j < characters.length(); j++) {


                sb.append(characters.charAt(j));
                if (sb.length() == combinationLength) {
                    list.add(sb.toString());

                }

                sb.deleteCharAt(sb.length() - 1);

            }

        }}

        String anan = " ";

//        for (int i = 0; i < characters.length(); i++) {
//
//
//
//            for (int j = 0; j < combinationLength; j++) {
//                anan = String.valueOf(characters.charAt(i));
//                anan = anan + characters.charAt(j+1);
//
//
//            }
//            la.add(anan);
//
//        }
        System.out.println("list = " + list);
        System.out.println("la" + la);





    }

    public String next() {

        // 호출 시 하나씩 반환



        String next = list.get(now++);
//        String next = la.get(now++);


        return next;

    }

    public boolean hasNext() {


        if (list.size() <= now) {
            return false;
        }

        return true;



    }

}
