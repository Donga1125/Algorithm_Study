package 알고리즘.단계별백준.기하직사각형삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼각형외우기 {
    
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());

        int sum = a + b + c;

            if (sum == 180) {


                if (a == 60 && b == 60 && c == 60) {
                    System.out.println("Equilateral");

                } else if (a != b && a != c && c != b) {
                    System.out.println("Scalene");
                }
                else
                    System.out.println("Isosceles");


            } else
                System.out.println("Error");


    }
}
