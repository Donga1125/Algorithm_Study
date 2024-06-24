package 알고리즘.항해99.오주차;

import java.util.ArrayList;
import java.util.List;

public class combinationIteratorAnswer {


//    1286. Iterator for Combination

    //String 문자열이 영어로 주어지는데, 사전 순으로 combi로 반환
    // 들어온 숫자만큼 짤라서 반환하면 됨
    // 순서 x 중복 상관 x 조합
    // 순서가 중요하고 반환도 사전 순서임 ab는 되지만 ba는 안된다는 뜻이고
    // ab -> bc가 아닌 ac가 나오야 사전순서
    // 다 만들어놓고 반환하자

    //next는 다음 조합된 요소를 반환
    //hasNext는 다음 조합 요소가 있으면 t,f 반환



    private List<String> list = new ArrayList<>();

    int now = 0;

    String characters = " ";
    int combiLength;




    public static void main(String[] args) {
        String ch = "chp";
        int combi = 1;
        String test = "abc";
        int comm = 2;
//        combinationIterator정답 main = new combinationIterator정답(ch, combi);
        combinationIterator main = new combinationIterator(test, comm);
        System.out.println(main.hasNext());
        System.out.println(main.next());
        System.out.println(main.hasNext());
        System.out.println(main.hasNext());
        System.out.println(main.next());
        System.out.println(main.next());
        System.out.println(main.hasNext());
        System.out.println(main.hasNext());
        System.out.println(main.hasNext());

        StringBuilder sb = new StringBuilder("Hello");


        String str1 = sb.toString();
        System.out.println("toString 사용 str1 = " + str1);


        String str2 = String.valueOf(sb);
        System.out.println("valueOf 사용 str2  = " + str2);


        sb = null;

        try {
            String str3 = sb.toString();
        } catch (NullPointerException e) {
            System.out.println("toString의 null의 경우 : " + e);
        }

        String str4 = String.valueOf(sb);
        System.out.println("str4 = " + str4);
    }



    public combinationIteratorAnswer(String characters, int combinationLength) {

        this.characters = characters;
        this.combiLength = combinationLength;


        generateCombinations(new StringBuilder(), 0);



    }

    private void generateCombinations(StringBuilder current, int start) {

        if (current.length() == combiLength) {
            list.add(current.toString());


            return;
        }

        for (int i = start; i < characters.length(); i++) {
            current.append(characters.charAt(i));
            generateCombinations(current, i + 1);
            current.deleteCharAt(current.length() - 1);

        }

    }


    public String next() {

        // 호출 시 하나씩 반환

        String next = list.get(now++);


        return next;

    }

    public boolean hasNext() {


        return combiLength < list.size();
        // size가 더 작으면 true
        // 5 < 10
        // 11 < 10 이면 False



    }

}
