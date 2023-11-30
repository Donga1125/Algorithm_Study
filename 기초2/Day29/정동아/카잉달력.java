package 기초2.Day29.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카잉달력 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        for (int i =0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int year = x;
            int last = LCM(N,M);

            while (true){
                //해가 최소공배수보다 크면 -1 출력
                if (year> last){
                    System.out.println(-1);
                    break;
                }
                //year을 N으로 나머지 연산을하면 y값을 얻을 수 있다.
                else if (((year%N) == 0 ? N : year%N) == y){
                    System.out.println(year);
                    break;
                }

                //year은 M만큼 증가
                year += M;
            }

        }
    }

    //최소 공배수
    public static int LCM(int A, int B){
        return A*B/GDC(A,B);
    }
    //최대 공약수
    public static int GDC(int A, int B){
        int temp = 0;
        while (B>0){
            temp = A%B;
            A = B;
            B = temp;
        }

        return A;
    }
}
