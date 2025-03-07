//package 알고리즘.프로그래머스.dfsbfs;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class 연습용 {
//
//    class Solution {
//
//        private static boolean[][] isVisited;
//        private static final int[][] movement = new int[][] {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
//        public int solution(int[][] maps) {
//            int n = maps.length;
//            int m = maps[0].length;
//
//            isVisited = new boolean[n][m];
//
//            Queue<int[]> queue = new LinkedList<>();
//            queue.offer(new int[]{0, 0}); // 큐에 시작 위치를 넣기
//            int answer = 1; // 시작지점도 하나로 시작
//            isVisited[0][0] = true; // 시작 지점을 방문했다고 표시
//
//            while (!queue.isEmpty()) { // 큐가 비어있지 않으면 계속함
//                int size = queue.size(); // 큐에 들어있는 값들만큼 돌아야함
//                for (int i = 0; i < size; i++) { // 가능한 상하좌우들을 돌고 가능하다면 그 거리는 추가해주기
//                    int[] now = queue.poll();
//                    int x = now[0];
//                    int y = now[1];
//
//                    if (x == n - 1 && y == m - 1) { // x,y가 끝까지 도착한 경우라면 ? answer을 return
//                        return answer;
//
//                    }
//
//                    for (int[] move : movement) { // 네 방향씩 탐색 (상하좌우)로 계속 탐색
//                        int toX = x + move[0];
//                        int toY = y + move[1];
//
//
//                        if (n > toX && m > toY && toX >= 0 && toY >= 0) {
//                            if (!isVisited[toX][toY] && maps[toX][toY] == 1) {
//
//
//                                // 조건이 좀 많긴 한데, 방문할 곳이
//                                // 1. 방문한 적이 없어야 하고,
//                                // 2. 벽이 아니여야 하고 (1이여야함)
//                                // 3. 0보다 크거나 같고 배열의 크기보다 작아야함 (배열 범위 안)
//                                queue.offer(new int[]{toX, toY}); //만족한다면 queue에 넣어주고 (담 탐색이 되니까)
//                                isVisited[toX][toY] = true; // 방문했다고 표시
//                            }
//                        }
//
//                    }
//                }
//                answer++; // 다 돌았으면 answer에 +1
//
//            }
//            return -1; // 다 돌았는데 안되면 -1 리턴
//        }
//
//}}
