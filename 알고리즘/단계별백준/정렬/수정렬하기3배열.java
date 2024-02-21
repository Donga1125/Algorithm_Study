package 알고리즘.단계별백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기3배열 {

    //시간은 줄였는데 메모리를 줄여야 한다.. 어떠게 할까 다른 알고리즘들을 써야 할듯 ?
    // 시간 초과는 버퍼리더랑 스트링빌더로 해결하고 공간은 ArrayList를 쓰니 메모리 초과라서 int배열로 받아서 해결
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

//        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
           // list.add(Integer.parseInt(br.readLine()));
            arr[i] = Integer.parseInt(br.readLine());
            
        }
        br.close();

//        Collections.sort(list);
        Arrays.sort(arr);

        for (int value : arr) {
            sb.append(value).append('\n');

        }

        System.out.println(sb);


    }
}
