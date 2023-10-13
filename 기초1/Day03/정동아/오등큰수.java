package 기초1.Day03.정동아;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오등큰수 {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuffer sb = new StringBuffer();

            int N = Integer.parseInt(br.readLine());
            int[] data = new int[N];
            int[] cnt = new int[1_000_001];
            int[] answer = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i<N; i++) {
                data[i] = Integer.parseInt(st.nextToken());
                cnt[data[i]]++;
            }

            Stack<Integer> s = new Stack<>();
            for(int i = 0; i<N; i++){
                while(!s.isEmpty() && cnt[data[s.peek()]]<cnt[data[i]]){
                    answer[s.pop()] = data[i];
                }

                s.add(i);
            }

            while(!s.isEmpty())
                answer[s.pop()] = -1;

            for(int i = 0; i<N; i++)
                sb.append(answer[i]).append(" ");

            System.out.println(sb);
        }
}
