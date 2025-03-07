package 알고리즘.프로그래머스.dfsbfs;

import java.util.*;

public class 단어변환 {

    public static void main(String[] args) {

        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        단어변환 main = new 단어변환();
        main.solution(begin, target, words);
    }
    // begin으로 시작해서 target으로 바꾸고 싶다.
    // 한번에 한개의 알파벳만 바꿀 수 있는데 그게 word안에 있어야 한다.
    // 하나씩 바꿔가는데, target에 도달하기 위해서 가장 짧은 변환 과정을 거쳐야 한다.
    // word에 없다면 0 리턴
    // bfs를 활용하면 좋을듯?

    //서로 연결된 그래프를 그리기가 핵심
    // 그래프를 그린 후 bfs로 탐색하며 가장 잛은 길을 찾아 리턴

    // 1. 첫 생각 set에다가 각 char를 저장 후 set의 크기로 비교하려 했지만,
    // 생각해보니 순서도 중요하기에 fail -> hit tho 일경우 하나만 다르지만 크기는 같다 xxxxxxx


    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int wordsSize = words.length;
        boolean isVisited[] = new boolean[wordsSize];
        //note 개선사항 1. 중복 확인을 위해 String 이면 set을 활용하는 것도 좋아보임!

        Queue<WordNode> queue = new LinkedList<>();

        queue.offer(new WordNode(begin, 0));



        while (!queue.isEmpty()) {

            WordNode current = queue.poll();
//            Object current = queue.poll();
            String word = current.word;
            int steps = current.steps;

            if (word.equals(target)) {
                System.out.println(steps);
                return steps;
            }

            for (int i = 0; i < wordsSize; i++) {
                String now = words[i];
                int nowSize = now.length();
                int count = 0;

               if(!isVisited[i]) {
                   for (int j = 0; j < nowSize; j++) {

                       if (word.charAt(j) == now.charAt(j)) {
                           count++;

                       }
                   }
                   if (nowSize - 1 == count) {
                       // note 개선사항 2. 모두 다 돌고, 수를 비교하는 것 보다 차이가 1 이상이면 바로 중단하는게 더 효율적


                       queue.offer(new WordNode(now, steps + 1));
                       isVisited[i] = true;
                   }
               }
            }
        }
        return 0;

    }

    class WordNode {

        String word;
        int steps;

        public WordNode(String word, int steps) {
            this.word = word;
            this.steps = steps;
        }
    }
}
