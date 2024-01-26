package 알고리즘.개발자취업하기.중요도고려한프린터;
// 일반적인 프린터 인쇄요이 들어온대로지만 중요도에 따라 먼저 인쇄될 수 있는 프린터
// 인쇄 대기목록의 가장 앞 문(J)를 대기 목록에서 꺼낸다.
// 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 하나라도 존재하면 J를 마지막으로 보내고 아님 J꺼내기
// 대기목록은 1-100, 인쇄목록은 1-9있고 클수록 중요
// location은 0 이상(현 대기목록 있는 작업 수 -1)이하의 값을 가지 대기목록의 가장 앞에 있으면 0, 아님 1로 표현
// 로케이션은 제로베이스로 인덱싱 하겠다 ! 뜻

// queue로 구현하면 일단 맨 앞에꺼 꺼내서 뒤에 꺼랑 비교 후 높은 게 있으면 마지막에 넣어주고 또 비교 후 반복

// class를 활용한 queue와 그냥 queue

import java.util.ArrayList;
import java.util.List;

public class SolutionClassAndQueue { // 그냥 큐만 쓰면 밀릴 수록 기존 인덱스 값이 바뀌니까 클래스로 관리한 queue
    public int solution(int[] priorities, int location) {
        // 1. queue를 만들기
        List<PrintJob> printer = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            printer.add(new PrintJob(i, priorities[i]));
        }
        int turn = 0;
        while (!printer.isEmpty()) { // 그럼 프린터에 남은 게 다 꺼내질 때 까지
            // 2. 0번을 꺼내서 max priority가 아니면 다시 맨 끝에 놓고
            PrintJob job = printer.remove(0);
            if (printer.stream().anyMatch(otherJob -> job.priority < otherJob.priority)) { // 스트림은 프린터에 있는 걸 다 꺼내왔다고 치는 느낌
                // 현재 job의 우선순위보다 남은 job의 우선순위가 높은 게 있는지 ? 내가 제일 중요한 앤지 ?
                printer.add(job); //있다면 지금 job은 다시 넣어주기
            } else {  // 3. max priority가 맞다면 내가 찾는 job이 맞는  확인한다.
                turn++; // 내가 가장 높으니까 턴이 늘어남 (수행됨) 몇번째 턴인지 알고 싶으니까
                if (location == job.location) { // 만약 로케이션이 같다면 ? 브레이크로 빠져나오기
                    break;
                }
            }
        }

        return turn;
    }

    class PrintJob {
        int location;
        int priority;

        public PrintJob(int location, int priority) {
            this.location = location;
            this.priority = priority;

        }
    }

    public static void main(String[] args) {
        SolutionClassAndQueue sol = new SolutionClassAndQueue();
        int[] priorities = {2, 1, 3, 2};
        System.out.println(sol.solution(priorities, 1));

    }
}
