package 알고리즘.단계별백준.일차원배열;

import java.util.Scanner;

public class 나머지 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int answer[] = new int[10];
        int count = 0;
        boolean bl;

        for (int i = 0; i < 10; i++) {

            arr[i] = sc.nextInt();
            answer[i] = arr[i] % 42;
            }

        for (int i = 0; i < 10; i++) {
            bl = false;

            for (int j = i + 1; j < 10; j++) { // 다시 j가 1부터 계산이 아니라 i+1한 값으로 계산
                if (answer[i] == answer[j]) {
                    bl = true;
                    break;
                }
            }
            if (bl == false) {
                count++;
            }

        }

            System.out.println(count);
            
        }

    }





