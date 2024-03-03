package 알고리즘.단계별백준.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 베르트랑공준 {

    //n이 주어지면 n과 2n 사이의 소수는 하나 이상 존재하고, 그 갯수를 반환
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      while (true) {
          int count = 0;
          int n = Integer.parseInt(br.readLine());

          if (n == 0) {
              break;
          }
          int m = n * 2;

          boolean arr[] = new boolean[m +1];

          arr[0] = arr[1] = true;

          for (int i = 2; i <= Math.sqrt(m); i++) {
              if (!arr[i]) {
                  for (int j = i * i; j <= m; j = j + i) {
                      arr[j] = true;
                  }
              }

          }
          for (int i = n + 1; i <=m ; i++) { // 조건이 n은 포함이 안됨
              if (!arr[i]) {
                  count++;
              }

          }

          System.out.println(count);


      }
        br.close();
            
    }
}
