package 알고리즘.단계별백준2.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전0 {

    //11047

    //그리디 동전
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        int count = 0;
        
        int arr[] = new int[t];

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());

        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] <= price) {
                price = price - arr[i];
                count++;


            }
        }

//
        System.out.println(count);
            
    }
}
