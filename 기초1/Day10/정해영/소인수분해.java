package 기초1.Day10.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class 소인수분해 {

    //        72 / 2 = 36;
//            36 / 2 = 18;
//            18 / 2 = 9;
//            9 / 3 = 3;
//            3 / 3= 1;
//            1 < 2; (break);

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new LinkedList<>();

        while (true){
            if(n < 2) break;
            for(int i=2; i<=n; i++){
                if(n%i == 0){
                    list.add(i);
                    n /= i;
                    break;
                }
            }
        }
        list.forEach(System.out::println);
        br.close();
    }
}
