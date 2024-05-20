package 알고리즘.프로그래머스.항해99.일주차;

import 알고리즘.개발자취업하기.문자열압축.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class PhoneBook {
    // 1주차 5.20 일 미들러

    // 입력 받은 배열 기준으로 길이 저장 후 같거나 크다면 그 배열의 앞 부분이 subString이 같은 지 확인 후 바로 true 반환
    // 다음 배열로 1,000,000 니까 끝까지 돌고 false 반환
    private static String[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        PhoneBook pb = new PhoneBook();
        pb.Solution(input);


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
        return true;

        String sp = phone_book[0];
        boolean answer = true;
        return answer;
    }
}
