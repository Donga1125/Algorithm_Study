package 알고리즘.코테실전비슷문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 비밀번호발음하기 {
    /*
    모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
    모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
    같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.

     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {

            String s = br.readLine();
            if (s == "end") {
                break;
            }

            boolean mFlag = false;
            boolean eoFlag = true;
            boolean jmFlag = true;
            int mCnt = 0;
            int jCnt = 0;



            for(int i = 0 ; i< s.length(); i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u'){
                    mFlag = true;
                    mCnt++;
                    jCnt = 0;
                    if(mCnt >= 3){
                        jmFlag = false;
                        break;
                    }
                }else {
                    jCnt++;
                    mCnt = 0;
                    if(jCnt >= 3){
                        jmFlag = false;
                        break;
                    }
                }

                if(i >= 1){
                    if(s.charAt(i) != 'e' && s.charAt(i) != 'o'){
                        if(s.charAt(i) == s.charAt(i-1)) eoFlag = false;
                    }
                }
            }

            if(jmFlag && eoFlag && mFlag){
                System.out.println("<" + s + "> is acceptable.");
            }else{
                System.out.println("<" + s + "> is not acceptable.");
            }
        }
    }




        }

