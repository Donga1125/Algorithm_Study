package 알고리즘.단계별백준.문자열;

import java.util.HashMap;
import java.util.Scanner;

public class 다이얼해쉬 {
    static HashMap<Integer, String> map = new HashMap<>();

    //해쉬로 값을 저장하자!

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int answer = 0;



        map.put(3, "ABC");
        map.put(4, "DEF");
        map.put(5, "GHI");
        map.put(6, "JKL");
        map.put(7, "MNO");
        map.put(8, "PQRS");
        map.put(9, "TUV");
        map.put(10, "WXYZ");

        for (int i = 0; i < str.length(); i++) {

            String target = String.valueOf(str.charAt(i));

            for (int j = 3; j < 11; j++) {
                String arr = map.get(j);
                if (arr.contains(target)) {
                    answer = answer + j;

                }
                }
            }
        System.out.println(answer);

        }




    }

