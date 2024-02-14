package 알고리즘.단계별백준.약수배수소수;

import java.util.ArrayList;
import java.util.Scanner;

public class 약수구하기 {
    //약수들을 다 구하고,

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();


        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                arrayList.add(i);
            }

        }
        if (arrayList.size() >= k) {
            System.out.println(arrayList.get(k - 1));
        } else
            System.out.println(0);

    }
}
