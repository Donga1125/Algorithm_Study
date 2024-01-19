package 알고리즘.별찍기;

public class StarFor {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            n++;
            System.out.println();
        }
        System.out.println("=================");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=================");
        n = 6;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
        System.out.println("=================");

        for (int i = 0; i < 5; i++) {

            for (int k = 0; k <= i; k++) {
                if(k!=0)
                System.out.print(" ");
            }


            for (int j = 5; i < j; j--) {
                System.out.print("*");

            }


            System.out.println();
        }
    }
}
