package 알고리즘.단계별백준.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 세로읽기 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = new String[5];
        Character ch[][] = new Character[5][15];
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i] = st.nextToken();

            for (int j = 0; j < arr[i].length(); j++) {
                ch[i][j] = arr[i].charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(ch[j][i] == null){
                    answer = answer + "";
                } else
                answer = answer + ch[j][i];
            }
        }

        System.out.println(answer);


            
        }
    }

