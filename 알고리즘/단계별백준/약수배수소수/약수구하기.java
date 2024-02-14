package 알고리즘.단계별백준.약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 약수구하기 {
    //약수들을 다 구하고,

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
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
