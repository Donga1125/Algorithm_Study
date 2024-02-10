package 알고리즘.단계별백준.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 크로아티아알파벳 {
    // 크로아티아 알파벳 8개가 있고 그 안에 몇개가 포함되어 있는 지 ? 없는건 한글자씩 세기
    // 해쉬로 저장ㅎ랄까 ?..

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();


        int count = 0;
        StringBuilder sb = new StringBuilder();


        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            if(str.contains(arr[i])) {
                count++;
                // 카운트 올려주고 잘라주고
                str = str.replaceAll(arr[i]," ");// 중복인 모든 걸 다바꿔주구나!!
            }
        }




        System.out.println(str.length());



    }
}
