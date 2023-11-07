package 기초1.Day19.정해영;

import java.util.Scanner;

public class RGB거리 {

    static int Red = 0;
    static int Green = 1;
    static int Blue = 2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //집의 수

        int[][] arr = new int[n][3];

        for(int i=0; i<n; i++){
            arr[i][Red] = sc.nextInt();
            arr[i][Green] = sc.nextInt();
            arr[i][Blue] = sc.nextInt();
        }

        for(int i=1; i<n; i++){
            arr[i][Red] += Math.min(arr[i - 1][Green], arr[i - 1][Blue]);
            arr[i][Green] += Math.min(arr[i - 1][Red], arr[i - 1][Blue]);
            arr[i][Blue] += Math.min(arr[i - 1][Red], arr[i - 1][Green]);
        }

        //n-1까지 구해놓고 마지막으로 그들중 최솟값을 구해준다.
        //arr에는 누적합이 쌓여있는것이다.

        System.out.println(Math.min(Math.min(arr[n-1][Red], arr[n-1][Green]),arr[n-1][Blue]));
        sc.close();
    }
}
