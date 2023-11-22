package 기초1.Day05.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String string = br.readLine();

        for(int i=0; i<string.length(); i++){
            char c = string.charAt(i);

            if(c>='a' && c<='z'){
                if(c + 13 > 'z'){ //c + 13 이 소문자 범위를 넘어가는 경우
                    c = (char) (c - 13);
                    sb.append(c);
                }else{ //c + 13 이 소문자 범위를 넘어가지 않는경우 출력
                    c = (char) (c + 13);
                    sb.append(c);
                }

            }else if(c>='A' && c<='Z'){
                if(c + 13 > 'Z'){ //c + 13 이 대문자 범위를 넘어가는 경우
                    c = (char) (c - 13);
                    sb.append(c);
                }else{ //c + 13 이 대문자 범위를 넘어가지 않는경우 출력
                    c = (char) (c + 13);
                    sb.append(c);
                }
            }else {  //영문자가 아닌경우 그대로 출력
                sb.append(c);
            }
        }
        System.out.println(sb);
        br.close();
    }
}
