package 알고리즘.단계별백준.약수배수소수;


import java.util.Scanner;


public class 배수와약수 {

    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {



            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0) {
                break;
            }

            if (b % a == 0) {
                System.out.println("factor");}

            else if ( a % b == 0) {
                System.out.println("multiple");

            } else
                System.out.println("neither");

        }
        sc.close();
    }
}
