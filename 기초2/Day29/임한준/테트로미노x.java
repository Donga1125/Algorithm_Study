package 기초2.Day29.임한준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 테트로미노x {

    /**
     문제 14500
     폴리오미노란 크기가 1×1인 정사각형을 여러 개 이어서 붙인 도형이며, 다음과 같은 조건을 만족해야 한다.

     정사각형은 서로 겹치면 안 된다.
     도형은 모두 연결되어 있어야 한다.
     정사각형의 변끼리 연결되어 있어야 한다. 즉, 꼭짓점과 꼭짓점만 맞닿아 있으면 안 된다.
     정사각형 4개를 이어 붙인 폴리오미노는 테트로미노라고 하며, 다음과 같은 5가지가 있다.

     아름이는 크기가 N×M인 종이 위에 테트로미노 하나를 놓으려고 한다. 종이는 1×1 크기의 칸으로 나누어져 있으며, 각각의 칸에는 정수가 하나 쓰여 있다.

     테트로미노 하나를 적절히 놓아서 테트로미노가 놓인 칸에 쓰여 있는 수들의 합을 최대로 하는 프로그램을 작성하시오.

     테트로미노는 반드시 한 정사각형이 정확히 하나의 칸을 포함하도록 놓아야 하며, 회전이나 대칭을 시켜도 된다.

     입력
     첫째 줄에 종이의 세로 크기 N과 가로 크기 M이 주어진다. (4 ≤ N, M ≤ 500)

     둘째 줄부터 N개의 줄에 종이에 쓰여 있는 수가 주어진다. i번째 줄의 j번째 수는 위에서부터 i번째 칸, 왼쪽에서부터 j번째 칸에 쓰여 있는 수이다.
     입력으로 주어지는 수는 1,000을 넘지 않는 자연수이다.

     출력
     첫째 줄에 테트로미노가 놓인 칸에 쓰인 수들의 합의 최댓값을 출력한다.
     */
//    static int [][] tetro0, tetro1, tetro2, tetro3, tetro4;
//    // 직 2개, 정 1개, z 4개, ㅜ4개, L 4개 ,L 반대 4개
//
//    public static void fillArr() {
//        //0123 상하좌우
//        tetro0[0][0] = 3; tetro0[0][1] = 3; tetro0[0][2] = 3; //직사각형 오른쪽
//        tetro0[0][0] = 1; tetro0[1][0] = 1; tetro0[2][0] = 1; //직사각형 아래
//
//        tetro1[0][0] = 3; tetro1[0][1] = 1; tetro1[2][1] = 2; //정사각형 (1개)
//
//        tetro2[0][0] = 3; tetro2[0][1] = 1; tetro2[1][1] = 3; //Z
//        tetro2[0][0] = 1; tetro2[0][1] = 3; tetro2[1][1] = 1;
//        tetro2[2][0] = 0; tetro2[1][0] = 3; tetro2[1][1] = 0;
//        tetro2[1][0] = 3; tetro2[1][1] = 0; tetro2[0][1] = 3;}

    private static int N, M;
    private static int[][] map;
    private static int[][][] blockCase = new int[][][]{
            {{0, 0}, {0, 1}, {1, 0}, {1, 1}}, // 네모 블럭
            {{0, 0}, {0, 1}, {0, 2}, {0, 3}}, // l블록 가로배치
            {{0, 0}, {1, 0}, {2, 0}, {3, 0}}, // l블록 세로 배치
            {{0, 0}, {0, 1}, {0, 2}, {1, 1}}, // ㅜ블록 배치
            {{0, 0}, {0, 1}, {0, 2}, {-1, 1}}, // ㅗ블록 배치
            {{0, 0}, {1, 0}, {2, 0}, {1, 1}}, // ㅏ블록 배치
            {{0, 0}, {1, 0}, {2, 0}, {1, -1}}, // ㅓ블록 배치
            {{0, 0}, {1, 0}, {1, 1}, {2, 1}}, // 4번째 블록 정배치
            {{0, 0}, {1, 0}, {1, -1}, {2, -1}}, // 4번째 블록 정배치 대칭
            {{0, 0}, {0, -1}, {1, -1}, {1, -2}}, // 4번째 블록 우측 1회전
            {{0, 0}, {0, 1}, {1, 1}, {1, 2}}, // 4번째 블록 우측 1회전 대칭
            {{0, 0}, {1, 0}, {2, 0}, {2, 1}}, // L블록 배치
            {{0, 0}, {1, 0}, {2, 0}, {2, -1}}, // L블록 대칭 배치
            {{0, 0}, {1, 0}, {0, 1}, {0, 2}}, // ㄱ블록(가로 긴 버전) 대칭 배치
            {{0, 0}, {0, 1}, {0, 2}, {1, 2}}, // ㄱ블록(가로 긴 버전) 배치
            {{0, 0}, {0, 1}, {1, 1}, {2, 1}}, // ㄱ블룩(세로 긴 버전) 배치
            {{0, 0}, {0, 1}, {1, 0}, {2, 0}}, // ㄱ블록(세로 긴 버전) 대칭 배치
            {{0, 0}, {1, 0}, {1, 1}, {1, 2}}, // ㄴ블록 배치
            {{1, 0}, {1, 1}, {1, 2}, {0, 2}} // ㄴ블록 대칭 배치
    };

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    private static void solve() {
        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < blockCase.length; k++) {
                    int sum = 0;
                    boolean isBlock = true;
                    for (int t = 0; t < 4; t++) {
                        int bx = i + blockCase[k][t][0]; // 체크하고자 하는 블록의 x
                        int by = j + blockCase[k][t][1]; // 체크하고자 하는 블록의 y

                        if (bx < 0 || by < 0 || bx >= N || by >= M) {
                            isBlock = false;
                            break;
                        }

                        sum += map[bx][by];
                    }

                    if (!isBlock) continue;

                    ans = Math.max(ans, sum);
                }
            }
        }

        System.out.println(ans);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}

