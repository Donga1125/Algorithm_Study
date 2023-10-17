package 기초1.Day06.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나머지 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String[] input = br.readLine().split(" ");
        int[]arr = new int[input.length];

        for (int i =0; i<input.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }


        int num1 = arr[0] + arr[1]; //(A+B)
        int num2 = arr[0] % arr[2]; //(A%C)
        int num3 = arr[1] % arr[2]; //(B%C)
        int num4 = arr[0] * arr[1]; //(AXB)

        br.close();
        sb.append(num1%arr[2]).append('\n');
        sb.append((num2+num3)%arr[2]).append('\n');
        sb.append(num4%arr[2]).append('\n');
        sb.append((num2*num3)%arr[2]).append('\n');

        System.out.println(sb);

    }
}
