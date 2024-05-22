package 알고리즘.프로그래머스.항해99.일주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class 기능개발 {
    // 100%되면 사용 가능하고 각 기능마다 시간이 다 다르다.
    // 그렇지만 배포는 앞에 완료해야 나올 수 있음
    // 한번의 배포 시 몇개씩 배포 되는 지 return하기
    // 먼저 queue 인 fifo으로 해야할 듯 오랜만에 큐도 같이 구현해보자
    // queue로 만들고 나올 때 갯수를 세면 될듯 ?  현재 작업량과 각 작업 별 스피드가 주어짐
    // 

    // progresses	  speeds	      return
    // [93, 30, 55]	  [1, 30, 5]      [2, 1]
    // 7일 째 2개 배포 9일째 1개 배포

    public static void main(String[] args) {
        int[] pr = new int[]{93, 30, 55};
        int[] st = new int[]{1, 30, 5};

        기능개발 dev = new 기능개발();
        System.out.println(dev.solution(pr, st));


    }


    // queue의 문제였지만, 다른 방식으로 써서 해결한 것이다.
    private int[] solution(int[] progresses, int[] speeds) {

        int[] answer = new int[101];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }


    public class ArrayQueque {
        int max = 1000;
        int front;
        int rear;
        int[] queue;

        public ArrayQueque() {
            front = rear = 0; // 생성자 호출 시 초기 값 0
            queue = new int[max]; // max 배열로 초기화
        }

        public boolean queueIsEmpty() { // queue가 비었는 지 확인 0 or -1
            return front == rear;
        }

        public boolean queueIsFull() { // queue가 다 찼는 지 확인
            if (rear == max - 1) {
                return true;
            } else
                return false;
        }

        public int size() { // 현재 데이터 갯수 리턴
            return front - rear;
        }

        public void push(int value) {
            if (queueIsFull()) {
                System.out.println("queue가 다 찼습니다.");
                return;

            }
            queue[rear++] = value;
        }

        public int pop() {
            if (queueIsEmpty()) {
                System.out.println("queue가 데이터가 없습니다.");
                return -1;
            }
            return queue[front++];
        }

        public int peek() {
            if (queueIsEmpty()) {
                System.out.println("queque에 데이터가 없습니다.");
                return -1;
            }
            return queue[front];
        }


        }

}



/**
 * public class Solution {
 *     // queue의 문제였지만, 다른 방식으로 써서 해결한 것이다.
 *     public int[] solution(int[] progresses, int[] speeds) {
 *
 *         List<Integer> answer = new ArrayList<>();
 *
 *         for (int i = 0; i < progresses.length; i++) {
 *             // 1. 1개 기능을 개발하는데 필요한 날짜를 계산한다.
 *             double days = (100 - progresses[i] / (double) speeds[i]);
 *             // 100 - 30 / 30
 *             int dayUp = (int) Math.ceil(days); // days 실형 값을 올림해서 int로 캐스팅해서 dayUP에 담아줌 (걸리는 날짜가 담김)
 *
 *             // 2. 함께 배포할 기능의 인덱스를 찾기.
 *             int j = i + 1;
 *             for (; j < progresses.length; j++) {
 *                 //j번째의 기능이 dayUP만큼 날짜가 지났을 때 개발이 완료되어 같이 배포할 수 있는 지 없는 지 알아보는 것
 *                 if (progresses[j] + dayUp * speeds[j] < 100)
 *                     break;}
 *                 // break 한 값이 함께 배포할 수 없는 첫번째 인덱스
 *
 *
 *
 *             // 3. 이번에 배포할 기능의 갯수를 추가한다.
 *                 answer.add(j - i); //함께 배포할 수 없는 첫번째 인덱스에서 현재 기능의 위치를 빼주면 그 사이에 몇개를 배포할 수 있는 지 차이값을
 *                 //담아줌
 *                 i = j - 1; // i와 j사이에는 answer에 배포되었기때문에 그 다음 값은 i는 j번째에서 시작하길 원함
 *
 *         }
 *
 * //        int[] answerArray = new int[answer.size()]; // 방법 1.arrays를 int[]에 담아서 반환하기 위해
 * //        for (int i = 0; i < answer.size(); i++) {
 * //            answerArray[i] = answer.get(i);
 * //        }
 * //        return answerArray;
 *         return answer.stream().mapToInt(i -> i.intValue()).toArray();
 *         // answer라는 arrayList에 .stream() 으로 각각의 Integer객체를 꺼내오는 동작이고
 *         // .mapToInt(i -> i.intValue) 인티저객체 i를 인트형태로 바꿀 것이다. i.intValue 그럼 최종적으로 int의stream이 되는데
 *         // 반환은 array로 하고 싶으니 toArray
 *
 *     }
 * }
 */
