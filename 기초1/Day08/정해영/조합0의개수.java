package 기초1.Day08.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 조합0의개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");

        long n = Long.parseLong(split[0]);
        long m = Long.parseLong(split[1]);

        long count5 = count5(n) - count5(n-m) - count5(m);
        long count2 = count2(n) - count2(n-m) - count2(m);


        System.out.println(Math.min(count5,count2));
        br.close();

    }

    public static int count5(long num){
        int count = 0;

        while (num >=5){
            count = (int) (count + (num/5));
            num = num/5;
        }
        return count;
    }


    public static int count2(long num){
        int count = 0;

        while (num >=2){
            count = (int) (count + (num/2));
            num = num/2;
        }
        return count;
    }
}
