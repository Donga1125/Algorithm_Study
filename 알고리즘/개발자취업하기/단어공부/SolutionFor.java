package 알고리즘.개발자취업하기.단어공부;

import java.io.*;
import java.util.*;
//문제
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//입력
//첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//출력
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

public class SolutionFor {

    String str;





    public String Solution(String str) throws IOException {
        String answer = "";
        ArrayList<Integer> total = new ArrayList<>();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ca = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.indexOf(j) == str.indexOf(i));
                count++;
                total.add(count); // 이것도 그 스펠링이 total의 i번째일 가능성이 없다 왜냐면 더해지면 5size가 3이나 2가 될 수도 있기에
                // 그럼  map으로 관리 해야겠네..


//            if (str.startsWith(String.valueOf(ca))) {
//                count++;
//                total = str.substring(1, str.length() + 1);
//            }
//            else total = str.substring(1, str.length() + 1);

                }}
                    return answer;}


                    public static void main (String[]args) throws IOException {
                    SolutionFor sol = new SolutionFor();
                    String str = "Mississipi";
                    System.out.println(sol.Solution(str));

                }


                }
