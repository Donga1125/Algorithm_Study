package 알고리즘.프로그래머스.항해99.오주차;

import 알고리즘.프로그래머스.항해99.일주차.PhoneBook;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;


public class sortCharactersByFrequency {

    //주어진 s를 나타나는 빈도수에 대해 내림차순으로 반환
    //같은 수의 빈도라면 위치 상관 x , 붙어있어야 함

    //50만 들어오고, 소문자 대문자 둘다 들어옴

    //문자를 돌면서 숫자를 세기 ? 그 후 객체로 비교 해서 정렬compator
    //map에 저장하고, 그 빈도수로 찾으면 더 편할듯 ?
    //map은 제일 많은 수를 키로 넣고, 값으로 그 수를 꺼내면 ? 그러면 넣을 때 마다 키 값이 달라지나 ?..
    private static HashMap<Integer, Character> map = new HashMap<>();


    public static void main(String[] args) {
        String s = "tree";

        sortCharactersByFrequency main = new sortCharactersByFrequency();
        System.out.println(main.frequencySort(s));

    }

    public String frequencySort(String s) {


        Arrays.sort(s, new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });


        return s;
    }
}
