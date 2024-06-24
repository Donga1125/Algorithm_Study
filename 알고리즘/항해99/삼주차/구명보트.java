package 알고리즘.항해99.삼주차;

import java.util.*;

public class 구명보트 {

    //무인도에 갇힌 사람이 탈출하기 위해 구명보트 사용
    //구명 보트는 작아 2명밖에 못타고, 무게 제한도 있음
    //예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고
    //구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만
    //1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.

    // 최대한 적게 구명보트 사용해서 탈출
    //사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어짐

    // 투포인터로 ?

    public static void main(String[] args) {
        int[] arr = new int[]{20,50,60,70,80};
        int limit = 100;
        구명보트 main = new 구명보트();

        System.out.println(main.solution(arr, limit));



    }
    private int solution(int[] people, int limit) {

        Arrays.sort(people);
        int count = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < people.length; i++) {
            deque.add(people[i]);
        }

        while (!deque.isEmpty()) {

            int start = deque.getFirst();
            int end = deque.getLast();

            if (deque.size() == 1) {
                deque.removeFirst();


                return ++count;

            }

            if (start + end <= limit) {

                deque.removeFirst();
                deque.removeLast();
                count++;


            } else if (start + end > limit) {


                deque.removeLast();
                count++;
            }}





//        int start = 0;
//        int end = people.length - 1;
//        while (start != end) { // 이러면 그 수 하나를 세어주지 못한다..
//            if (end - start == 1) {
//                count++;
//                return count;
//            }
//            if (people[start] + people[end] > limit) {
//                end--;
//                count++;
//
//            }
//            else {
//                start++;
//                count++;}
//
//        }

        return count;


    }
}
