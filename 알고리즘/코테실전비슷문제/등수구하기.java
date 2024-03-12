package 알고리즘.코테실전비슷문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 등수구하기 {
    //점수의 갯수 n 새로운 태수의 점수와  총 리스트에 올라가있는 점수의 갯수t가주어질 때
    // 새로운 태수의 점수가 리스트에 몇번째에 올라가는 지 구해라.
    // 점수 같으면 같은 등수가 되고 리스트가 꽉 차면 태수의 점수가 리스트보다 더높아야만  올라가진다 못올라가면 -1 출력

    // 정렬해서 순위 반환하면 될듯 ?
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int list = Integer.parseInt(st.nextToken());
        int rank = 0;
        ArrayList<Integer> arrList = new ArrayList<>();

        if (n == 0) {
            System.out.println(1);
            return;
        }



//        int arr[] = new int[list];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            arrList.add(Integer.parseInt(st.nextToken()));


        }

        if (arrList.get(list -1) < score) { // rank는 고민말고 다 넣어주고 마지막에 랭크 다시 찾자!


            for (int i = 0; i < n; i++) {
                if (arrList.get(i) > score) {
//                    arrList.add(arr[i]);
                    rank++;

                } else if (arrList.get(i) <= score) {
//                    arrList.add(score);
                    rank++;
                    break;

                }
            }
            System.out.println(rank);
        } else {
            System.out.println(-1);
        }






    }
}
