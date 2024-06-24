package 알고리즘.항해99.사주차;

import java.util.*;

public class 순위위상정렬실패 {

    //1~n번까지의 권투선수, 1대1 방식으로 매치 결과를 0,1의 배열로 주어지는데 0이 이긴 선수 1이 진 선수
    //주어진 매치 결과 순위를 매기려고 하는데 모든 결과가 있지 않아 정확하게 순위를 매길 수 없다
    // 결과만 보고 정확한 순위를 알 수 있는 선수의 수를 return

    //그래프로 방향성을 주고, 정답 리스트를 놓아서      [0,1,2,3,4,~ , n] 의 값중 하나만 있으면 정답으로 처리하자

    //선수의 수는 1명 이상 100명 이하입니다.
    //경기 결과는 1개 이상 4,500개 이하입니다.
    //results 배열 각 행 [A, B]는 A 선수가 B 선수를 이겼다는 의미입니다.
    //모든 경기 결과에는 모순이 없습니다.
    public static void main(String[] args) {

        int[][] fight = new int[][] {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
        int n = 5;

        순위위상정렬실패 main = new 순위위상정렬실패();
        System.out.println(main.solution(n, fight));

    }

    public int solution(int n, int[][] results) {

        //나보다 쎈 사람과 약한 사람을 구분해서 써야 하나 ?

        int answer = 0;

        List<ArrayList<Integer>> listWin = new ArrayList<>();
        List<ArrayList<Integer>> listLose = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            listWin.add(new ArrayList<>());
            listLose.add(new ArrayList<>());
        }
        // 나보다 쎈 사람만 ? 단반향을 그려야 하는데, 어떤 조건을 넣어야 순위가 정해질까
        // 나보다 쏀 사람의 정보만 넣을 지 아님 약한 사람만 넣을 지 ?
        // 둘다 따로 저장해서 활용해야하나 ? 아님 양방향으로도 가능한가 ? (양방향은 아닌 것 같다)


        for (int[] result : results) {
            int win = result[0];
            int lose = result[1];



            listWin.get(win).add(lose); // 일단 이긴 사람의 index에 진 사람을 저장
            listLose.get(lose).add(win);
        }

        for (int i = 1; i <= n; i++) {
            if (isPossibleRate(i, n, listWin, listLose)) {
                answer++;
            }
        }
        
        

//        int[] rating = new int[n + 1]; // 순위 저장
//        boolean[] visited = new boolean[n + 1]; //방문여부
//        Queue<Integer> queue = new LinkedList<>(); // 큐 구현
//
//        // 기준 점을 누구로 잡아야 하나 ? 만약 1번이 아무에게도 이긴 사람이 없다면 ?
//        // queue에 넣어봤자 아무 것도 없는데 ?
//        // 찾아보니 기준점을 정점이 0인, 즉 이긴 기준이라면 한번도 이긴 적 없는 사람으로 출발
//        // 이긴기준으로는 다 이길 수 있나 ? 그러면 진 사람 기준으로도 찾아야할 거 같은데
//        queue.offer(1);
//        visited[1] = true;
//
//        while (!queue.isEmpty()) {
//
//            int now = queue.poll();
//
//            for (int i : listWin.get(now)) {
//                if (!visited[i]) {
//                    visited[i] = true;
//                    // 핵심 로직 ? 어떻게 순위를 정할 것인가 ?
//                    // 위상정렬 ? 진입차수가 0인 걸 알아내야 하는데 그건 꼴등이나 1위거나를 알아내야할듯
//                }
//            }
//        }




//
//        System.out.println(Arrays.toString(new List[]{listWin}));
//        System.out.println(Arrays.toString(new List[]{listLose}));


        
        
        return answer;
    }

    private boolean isPossibleRate(int now, int n,
                                   List<ArrayList<Integer>> listWin,
                                   List<ArrayList<Integer>> listLose) {

        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        queue.offer(now);
        visited[now] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;

            for (int next : listWin.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }

            // 진 경우 확인
            for (int next : listLose.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }


    }
        return count == n;
    }
}
