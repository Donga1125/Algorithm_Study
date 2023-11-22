package 기초1.Day10.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 진법변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");

        String n = split[0];
        long b = Long.parseLong(split[1]);

        long result = 0;

        for(int i=0; i<n.length(); i++){
            double pow = Math.pow(b, n.length() - 1 - i);
            long s;
            if(n.charAt(i) < 65){
                s = (long) ((n.charAt(i) - 48) * pow);
            }else {
                s = (long) ((n.charAt(i) - 55) * pow);
            }
            result += s;
        }
        System.out.println(result);
        br.close();
    }
}
