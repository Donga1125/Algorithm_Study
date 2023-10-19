package 기초1.Day08.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 팩토리얼0의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[] arr = (String.valueOf(factorial(n))).toCharArray();
        int count = 0;

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == '0'){
                count++;
            }else{
                System.out.println(count);
                break;
            }
        }
        br.close();
    }

    public static BigInteger factorial(int n){

        BigInteger result = new BigInteger(String.valueOf(1)); //biginteger로 사용해야한다.

        for(int i=2; i<=n; i++){
            result = result.multiply(BigInteger.valueOf(i)); //범위가 500까지 이므로 500!은 Long의 범위도 넘어간다.
        }

        return result;
    }
}
