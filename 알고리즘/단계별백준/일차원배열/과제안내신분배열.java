package 알고리즘.단계별백준.일차원배열;

import java.util.*;


public class 과제안내신분 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        

        for (int i = 0; i < 28; i++) {
            arrList.add(sc.nextInt());
        }
        Collections.sort(arrList);

        for (int i = 1; i <= 30; i++) {
            if (!arrList.contains(i)) {
                System.out.println(i);

            }


        }



        sc.close();
    }
}
