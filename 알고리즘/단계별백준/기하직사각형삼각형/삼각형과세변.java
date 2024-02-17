package 알고리즘.단계별백준.기하직사각형삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 삼각형과세변 {

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



            while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

                int sum = a + b + c;

                if (sum == 0) {
                    break;
                }

                int max = Math.max(Math.max(a, b), c);
                if(sum - max > max) {

                    if (a == b && a == c) {
                        System.out.println("Equilateral");
                    } else if (a != b && a != c && b != c) {
                        System.out.println("Scalene");
                    } else
                        System.out.println("Isosceles");}
                else
                    System.out.println("Invalid");


        }

            
    }
}
