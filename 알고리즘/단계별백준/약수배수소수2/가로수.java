package 알고리즘.단계별백준.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가로수 {
    // 주어진 수 중에 사이에 있는 가장 작은 걸 찾아야 하네 ( 증가도 만족 해야하는데 그건 고려 안하고 사이 수중 작은 것만 찾으면 될듯
    // 중간에만 심을 수 있다

    // 배열 사이 수 중 가장 작으면 된다고 생각했는데 가장 작으며서도 + 간격이 맞아야 한다 그걸 고려 안했음

    // 결과적으로 최대 공약수를 구해야함 !! 내가 구한건 간격 중 제일 작은 수를 구했는데 그게 아니라 젤 긴거랑 젤 짧은 거 중 제일 최대공약수를 구하면
    // 작은 수만 오더라도 그 사이에 하나 더 있는 간격을 구할 수 있게 됨

    // 추가로 새로 리스트써서 심고 그 수와 배열을 비교해서 구했는데 그러니까 메모리 초과 그냥 간단한 수식으로 구하는 걸로 변경


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];



        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(br.readLine());

        }

        int end = arr[n - 1];
        int start = arr[0];
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int i = 1; i < n; i++) {
//            min = (Math.min(min, arr[i] - arr[i - 1])); // 배열 중 가장 작은 수를 찾음
//            max = (Math.max(max, arr[i] - arr[i - 1]));
//
//            // 조건 추가 해야할듯.. 작으면서도 서로 사이 간격이 맞는 수 를 찾아야함
//        }
        int gcd = 0;

        for (int i = 0; i < n - 1; i++) {

            int distance = arr[i + 1] - arr[i];
            gcd = gcd(distance, gcd);
        }


//        int gcd = gcd(max, min);


//        System.out.println((((end - start) / gcd) + 1) - arr.length);

        // 총합 수에서 gcd를 나누면 간격이 나오고 간격이니까 총 나무 수는 +1 해준 수에서 - 주어진 수 빼면 몇개 더심었는지 알 수 있음

        int additionalTrees = (end - start) / gcd + 1 - n;
        System.out.println(additionalTrees);


        // 가로수를 심을 위치를 계산하고 리스트에 추가하지말고 그냥 총합 수에서 나누기 해서 나무 몇갠지 세면 되네

//        while (true) {
//            list.add(start);
//            start = start + gcd;
//
//
//
//            if (start == end) {
//                list.add(start);
//                break;
//            }
//        }


//        System.out.println(list.size() - arr.length);
    }

    public static int gcd(int a, int b) { // 재귀

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

