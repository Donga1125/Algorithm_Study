package 알고리즘.leetcode.february25;

import 알고리즘.개발자취업하기.체스판다시칠하기.main;

import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {

     static int size;

    //1079. Letter Tile Possibilities

    // 주어진 알파벳으로 만들 수 있는 경우의 수를 만들어라 중복 x
    // 조건 있는 수열


    public static void main(String[] args) {

        String tiles = "AAB";

        LetterTilePossibilities main = new LetterTilePossibilities();
        System.out.println(main.numTilePossibilities(tiles));

    }

    // 조건 있는 순열 조합 만들기
    // 조건을 검사하며 넣는 거 보다 다 만들고 중복을 제거하는 set에 담아주는 게 나을듯?


    public int numTilePossibilities(String tiles) {

        size = tiles.length();

        boolean[] isVisited = new boolean[size];

        Set<String> set = new HashSet<>();

        backTracking(tiles, "", set, isVisited);



        return set.size();

    }


    // 넘겼을 때 방문 여부까지 함께 확인해야할듯?
    private void backTracking(String tiles,String now,Set<String>set, boolean[] isVisited) {


        if (!now.isEmpty()) {
            set.add(now);
            
        }

        for (int i = 0; i < size; i++) {

            if (!isVisited[i]) {

                isVisited[i] = true;
                backTracking(tiles, now + tiles.charAt(i), set, isVisited);
                // 백트래킹 - 방문 해제
                isVisited[i] = false;

            }
            
        }

    }
}
