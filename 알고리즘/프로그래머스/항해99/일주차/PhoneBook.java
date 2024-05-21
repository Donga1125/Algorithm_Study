package 알고리즘.프로그래머스.항해99.일주차;

import 알고리즘.개발자취업하기.문자열압축.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;


public class PhoneBook {
    // 1주차 5.20 일 미들러

    // 입력 받은 배열 기준으로 길이 저장 후 같거나 크다면 그 배열의 앞 부분이 subString이 같은 지 확인 후 바로 true 반환
    // 다음 배열로 1,000,000 니까 끝까지 돌고 false 반환
    private static String[] input;
    private static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        PhoneBook pb = new PhoneBook();
        input = new String[] { "119", "97674223", "1195524421" };


        pb.solution2(input);
//        pb.Solution(input);
        // blog 나는 그냥 길이 별로 정렬했는데, 그러지말고 그냥 정렬하면
        // arrays의 배열이 붙으니까 양 옆만 비교하면 좀 더 빠르게 가능하다



    }

    private boolean Solution(String[] phone_book) {

        Arrays.sort(phone_book, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }

        });



        for (int i = 0; i < phone_book.length-1; i++) {
            int now = phone_book[i].length();


            for (int j = i+1; j < phone_book.length ; j++) {
                if (now < phone_book[j].length()) {
                    if (phone_book[j].startsWith(phone_book[i]) )

                        return false;
                }
            }
        }
        return true;}
//        Arrays.sort(phone_book, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//
//        });
//
//
//
//       for (int i = 0; i <= phone_book.length; i++) {
//                if(phone_book[i].length() < phone_book[i+1].length()){
//                    map.put(phone_book[i], i);
//                    // map으로 관리할 필요가 없어 보이네..
//
//                    String now = phone_book[i];
//
//                    Iterator<String> it = map.keySet().iterator();
//                    while (it.hasNext()) {
//                        String next = it.next();
//
//                        if (next.startsWith(now)) {
//                            return false;
//
//                        }
//
//                    }
//
//                }}
//        return true;
//
//
//    }



    private boolean solution2(String[] phone_book) {
        Arrays.sort(phone_book); // 이대로 119 , 119123, 44, 이런 식으로 접두어끼리 정렬하기

        for (int i = 0; i < phone_book.length; i++) {
            if (phone_book[i].length() < phone_book[i + 1].length()) {
                if (phone_book[i + 1].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return true;
    }



}
