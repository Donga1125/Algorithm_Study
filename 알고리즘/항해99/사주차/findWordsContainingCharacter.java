package 알고리즘.항해99.사주차;

import java.util.ArrayList;
import java.util.List;

public class findWordsContainingCharacter {

    //들어온 String 배열에서 현재 char의 letter이 있으면 그 인덱스 반환 없음 빈 배열
    //들어온 char와 String은 e다 lowerCase


    //완탐 ?
    // 50글자가 50개 최대 50x50 2500?


    public static void main(String[] args) {

        String[] arr = new String[]{"leet", "code"};
        String[] arr1 = new String[]{"abc","bcd","aaaa","cbc"};
        String[] arr2 = new String[]{"abc","bcd","aaaa","cbc"};
        char a = 'e';
        findWordsContainingCharacter main = new findWordsContainingCharacter();

        System.out.println(main.findWordsContaining(arr, a));
    }

    public List<Integer> findWordsContaining(String[] words, char x) {


        List<Integer> answerList = new ArrayList<>();


        for (int i = 0; i < words.length; i++) {
            String now = words[i];
            for (int j = 0; j < now.length(); j++) {

                if (now.charAt(j) == x) {

                    answerList.add(i);

                    break;
                }
            }
        }

        return answerList;

    }
}
