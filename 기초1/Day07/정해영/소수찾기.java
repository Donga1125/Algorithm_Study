package 기초1.Day07.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str," ");
        int count = 0;

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<N; i++){
            if(foundSosu(arr[i])==true){
                count ++;
            }
        }

        System.out.println(count);
        br.close();

    }

    private static boolean foundSosu(int num) { //소수 판별

        for(int i=2; i<=num; i++){ //소수는 자기자신과 1로만 나눠진다. 나머지경우엔 false
            if(num == i){ //자기자신으로 나눠지면 true
                return true;
            }else if(num % i == 0){ //자신이 되기전에 나머지0이되는 값이 있으면 false
                return false;
            }
        }
        return false; //num=1인경우 false
    }
}
