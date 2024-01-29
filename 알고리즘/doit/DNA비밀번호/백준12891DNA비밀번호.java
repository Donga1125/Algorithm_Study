package 알고리즘.doit.DNA비밀번호;

//평소에 문자열을 가지고 노는 것을 좋아하는 민호는 DNA 문자열을 알게 되었다.
// DNA 문자열은 모든 문자열에 등장하는 문자가 {‘A’, ‘C’, ‘G’, ‘T’} 인 문자열을 말한다.
// 예를 들어 “ACKA”는 DNA 문자열이 아니지만 “ACCA”는 DNA 문자열이다.
// 이런 신비한 문자열에 완전히 매료된 민호는 임의의 DNA 문자열을 만들고 만들어진 DNA 문자열의 부분문자열을 비밀번호로 사용하기로 마음먹었다.

//하지만 민호는 이러한 방법에는 큰 문제가 있다는 것을 발견했다.
// 임의의 DNA 문자열의 부분문자열을 뽑았을 때 “AAAA”와 같이 보안에 취약한 비밀번호가 만들어 질 수 있기 때문이다.
// 그래서 민호는 부분문자열에서 등장하는 문자의 개수가 특정 개수 이상이여야 비밀번호로 사용할 수 있다는 규칙을 만들었다.

//임의의 DNA문자열이 “AAACCTGCCAA” 이고 민호가 뽑을 부분문자열의 길이를 4라고 하자.
// 그리고 부분문자열에 ‘A’ 는 1개 이상, ‘C’는 1개 이상, ‘G’는 1개 이상, ‘T’는 0개 이상이 등장해야 비밀번호로 사용할 수 있다고 하자.
// 이때 “ACCT” 는 ‘G’ 가 1 개 이상 등장해야 한다는 조건을 만족하지 못해 비밀번호로 사용하지 못한다.
// 하지만 “GCCA” 은 모든 조건을 만족하기 때문에 비밀번호로 사용할 수 있다.
//
//민호가 만든 임의의 DNA 문자열과 비밀번호로 사용할 부분분자열의 길이,
// 그리고 {‘A’, ‘C’, ‘G’, ‘T’} 가 각각 몇번 이상 등장해야 비밀번호로 사용할 수 있는지 순서대로 주어졌을 때
// 민호가 만들 수 있는 비밀번호의 종류의 수를 구하는 프로그램을 작성하자. 단 부분문자열이 등장하는 위치가 다르다면
// 부분문자열이 같다고 하더라도 다른 문자열로 취급한다.
//
//입력
//첫 번째 줄에 민호가 임의로 만든 DNA 문자열 길이 |S|와 비밀번호로 사용할 부분문자열의 길이 |P| 가 주어진다. (1 ≤ |P| ≤ |S| ≤ 1,000,000)
//
//두번 째 줄에는 민호가 임의로 만든 DNA 문자열이 주어진다.
//
//세번 째 줄에는 부분문자열에 포함되어야 할 {‘A’, ‘C’, ‘G’, ‘T’} 의 최소 개수가 공백을 구분으로 주어진다.
// 각각의 수는 |S| 보다 작거나 같은 음이 아닌 정수이며 총 합은 |S| 보다 작거나 같음이 보장된다.

// 같음이 보장된다면 ㄷ ㅓ넘을 경우 예외처리할 필요가 없네

// 슬라이딩 윈도우 (투포인터랑 비슷한 느낌인데, 연속되는 (범위)로 판별

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 백준12891DNA비밀번호 {
    // 순서 비교를 어떻게 할까 하다가 그냥 임의로 내가 정렬하면 될 거 같은데 ?acgt를 내가 숫자로 생각해서 0123이 포함되기만 하면?
    // 아 근데 이렇게 복잡하게 푸는 게 맞을까..

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int answer = 0;

//        String password = br.readLine(); 스트링으로 안 받고 배열로 chatr 받아라고 하네
        String password = br.readLine();
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) =='A') ;


        }

        st = new StringTokenizer(br.readLine());
        int dna[] = new int[4];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 4; i++) { // 맵으로 관리도 생각해봤는데 일단 패스
            dna[i] = Integer.parseInt(st.nextToken());

        }
    }
}
