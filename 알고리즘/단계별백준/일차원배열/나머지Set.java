package 알고리즘.단계별백준.일차원배열;

import java.util.HashSet;
import java.util.Scanner;

public class 나머지Set {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {

            set.add(sc.nextInt() % 42);
            }



            System.out.println(set.size());
            
        }

    }





