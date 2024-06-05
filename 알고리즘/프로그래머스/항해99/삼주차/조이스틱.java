package 알고리즘.프로그래머스.항해99.삼주차;

public class 조이스틱 {
    // 완성해야 하는 글자가 3글자면 AAA, 4글자면 AAAA로 주어지는데
    // 조이스틱 마다 기능이 있다
    // 위는 다음 알파벳, 아래는 이전 알파벳(a라면 z로 이동가능)
    // 왼쪽은 커서의 이동(왼쪽 끝이면 오른쪽), 오른쪽도 커서의 이동(오른 끝이면 왼끝으로)
    // 가장 적게 움직여서 원하는 글자 만들기!

    // 커서의 이동은 aaaaaaz를 만들어야 한다면 왼쪽 커서로 움직이는게 베스트니까 필요
    // 알파벳을 저장해두고, 알파벳 총 크기와 그 수를 크기를 비교해 반이상일지 아닐지 판별, xx
    // 왼 오도 전체 문장의 인덱스와 그 인덱스의 절반을 비ㅣ교해 왼일지 오른일지 판별
    // 왼 오로 움직이려면 현재 인덱스를 저장해줘야 하나 ? aabaaaaaaab라면 오2번, 왼3번으로 최소 움직임을 가질 수 있으니
    // 알파벳 순서는 링크드 리스트로 관리 ? or  현재 위치는 큐로 관리 ? (이럴 필요 x)


    private final static int[] AlPHABET = new int[]
            {       65,66,67,68,69,70,71,72,73,74,
                    75,76,77,78,79,80,81,82,83,84,
                    85,86,87,88,89,90};
    public static void main(String[] args) {

        조이스틱 main = new 조이스틱();
        System.out.println(main.solution("JAZ"));;



    }

    public int solution(String name) {


        int count = 0;
        int answer = 0;
        int length = name.length();





        for (int i = 0; i <length; i++) {
            int now = name.charAt(i);

            if (now <= 77) {
                count = count+(now - 65);

            } else {
                count = count + (91 - now);
            }
        }


        int min = length - 1; // 오른쪽 쭉 하는 경우로 일단 먼저

        for (int i = 0; i < length; i++) {
            int next = i + 1;
            while (next != length && name.charAt(next) == 65) {
                next++;
            }
            // i까지 가는 거리 + 돌아가서 나머지 처리하는 거리
            min = Math.min(min, i + length - next + Math.min(i, length - next));
        }

        answer = count + min;


        return answer;
    }
}
