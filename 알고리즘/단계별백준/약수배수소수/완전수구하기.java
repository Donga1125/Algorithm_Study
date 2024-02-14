package 알고리즘.단계별백준.약수배수소수;

import java.util.ArrayList;
import java.util.Scanner;

public class 완전수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {





        ArrayList<Integer> arrayList = new ArrayList<>();

        int answer = 0;
        String str = "";

        int n = sc.nextInt();
            if (n == -1) {
                break;
            }

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                arrayList.add(i);
                answer += i;

            }
        }


        if (answer == n) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i == arrayList.size() - 1) {
                    str += arrayList.get(i);
                } else
                str += arrayList.get(i) + " + ";
            }
            System.out.println(n + " = " + str);

        } else
            System.out.println(n + " is NOT perfect.");// 다 더했을 떄 맞

    }}
}
