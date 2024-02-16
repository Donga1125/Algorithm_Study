package 알고리즘.단계별백준.기하직사각형삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 대지 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;

//        int[] x = new int[t];
//        int[] y = new int[t];



        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
//            if (x[i] > max){
//                max = x[i];}
//            if(x[i] < min) {
//                min = x[i];
//            }
           int y = Integer.parseInt(st.nextToken());
//            if (y[i] > maxy){
//                maxy = y[i];}
//            if(y[i] < miny) {
//                miny = y[i];
//            }

            maxX = Math.max(maxX, x);
            minX = Math.min(minX, x);
            maxY = Math.max(maxY, y);
            minY = Math.min(minY, y);

        }

        System.out.println((maxX - minX) * (maxY - minY));


        }
    }
