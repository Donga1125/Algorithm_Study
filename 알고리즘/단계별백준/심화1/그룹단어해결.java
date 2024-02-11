package 알고리즘.단계별백준.심화1;

import java.util.Scanner;

public class 그룹단어해결 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n; // 빼고 바로 break로 반복문 줄이기 위해 이게 더 낫다

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            boolean[] arr = new boolean[26]; // 알파벳의 갯수로 배열 만들어주기

            for (int j = 0; j < str.length() -1; j++) { // -1은 +1로 비교해야하니 넘을까봐
                if (str.charAt(j) != str.charAt(j + 1)) { //i와 i+1만 비교할꺼다
                    if (arr[str.charAt(j + 1) - 97] == true) { // i와 i+1을 비교했는데 다를 경우에 그다른 다음 수가 이미 있었던 수인지
                        // 확인해보고 맞다면 바로 count를 하나 뺴주고 바로 나오면 된다! -97은 아스키코드
                        count--;
                        break;

                    }
                }
                arr[str.charAt(j) - 97] = true;// 확인해봤는데 없으면 현재 j를 true로 바꿔주고 다음 수 확인

                }
            }
        System.out.println(count);
         }
    }

