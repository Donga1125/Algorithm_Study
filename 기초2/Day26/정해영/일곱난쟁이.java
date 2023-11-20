package 기초2.Day26.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이 {
    public static void main(String[] args) throws IOException {
        long beforeTime = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 9;
        int[] arr = new int[count];
        int sum = 0;

        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for(int i=0; i<count-1; i++){
            for(int j=i+1; j<count; j++){
                if(sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for(int k=2; k<count; k++){
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}
