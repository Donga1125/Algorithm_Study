package 알고리즘.단계별백준2.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
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

        for (int i = t -1 ; i >= 0; i--) {

            arr[i] = Integer.parseInt(br.readLine());

        }


        for (int i = 0; i < t; i++) {

            if (price == 0) {
                break;

            }

            if (arr[i] <= price) { // 나누기보다 걍 그 수보다 큰 수인  확인하면 되네
                count = count + (price / arr[i]);
                price = price % arr[i];

            }

        }

        System.out.println(count);








//        for (int i = arr.length - 1; i > 0; i--) {
//            if (arr[i] <= price) {
//                price = price - arr[i];
//                count++;
//
//
//            }
//
//

        }



            
    }

