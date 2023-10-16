package 기초1.Day05.정해영;

import java.io.IOException;
import java.util.Scanner;

public class 문자열분석 {

    //소문자, 대문자, 숫자, 공백
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final int SMALL = 0;
        final int BIG = 1;
        final int NUMBER = 2;
        final int SPACE = 3;

        while (scanner.hasNext()){

            int[] arr = new int[4];
            String string = scanner.nextLine();

            for(int i=0; i<string.length(); i++){

                char c = string.charAt(i);
                if(c >= 'a' && c <= 'z'){
                    arr[SMALL]++;
                } else if(c >= 'A' && c <= 'Z'){
                    arr[BIG]++;
                }else if(c >= '0' && c <= '9'){
                    arr[NUMBER]++;
                }else{
                    arr[SPACE]++;
                }
            }
            for (int i : arr){
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
        scanner.close();
    }
}
