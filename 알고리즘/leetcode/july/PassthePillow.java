package 알고리즘.leetcode.july;

public class PassthePillow {

    //베개를 갖고있고, n순서대로 넘긴다. 끝까지 도달하면 1번까지가고 다시 시작 반복

    //시간은 넘기면 흐르는듯 ?
    // 쭉 반복하면 되는데 반복문 말고 그냥 시간만큼 만들면 될 거 같읃[

    // )

    public static void main(String[] args) {
        int n = 4;
        int time = 5;
        PassthePillow main = new PassthePillow();
        main.passThePillow(n, time);
    }


    public int passThePillow(int n, int time) {

        int[] timeArr = new int[time + 1];
        int[] nArr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nArr[i] = i;
        }
        int nowP = 1;
        int nowM = 1;


        while (time == 0) {



        int answer = 0;

            return 0;

    }
        return 0;
}
}
