package 알고리즘.단계별백준.브루트포스;

import java.util.Scanner;

public class 설탕배달 {
    //5와 3으로 18을 만드는데 5를 많이쓰는 그리디는 안된다 5를 다 뺴고 나선 해가 안될 수 있다
    // 만약 못만들면 -1을 반환해라 아닐 경우 봉지 수만 반환


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int five = 5;
        int three = 3;
        int count = 0;

//        if (n % five == 0 || n % three == 0 || n % 8 == 0) {
//
//            while ((n - five >= 0 && n % five == 0) || (n - five >= 0 && n % 8 == 0) ) {
//               n=  n - five;
//                count++;
//            }
//            while (n - three >= 0) {
//                n = n - three;
//                count++;
//            }
//            System.out.println(count);
//
//        } else
//            System.out.println(-1);


//        if (n % five == 0 || n % three == 0 || n % 8 == 0 || (n - 5) % 5 == 0 || (n - 5) % 3 == 0 ||(n - 3) % 5 == 0
//        || (n - 3) % 3 == 0) {

            while (n >= 3) {

                if ((n - five >= 0 && n % five == 0)) {
                    n = n - five;
                    count++;
                } else {
                    n = n - three;
                    count++;
                }
            }


        if (n != 0 && n < 3) {
            System.out.println(-1);
        } else
            System.out.println(count);


    }
}

