package 알고리즘.키패드누르기;

// 시작 시점은 핸드폰 키패드 왼손은 *, 오른손은#이고 한 칸씩 움직일 수 있다. 엄지손가락만 사용해서
// 상하좌우 한 방향만 움직일 수 있고, 키패드 당 거리는 1  1,4,7은 왼손, 3,6,9 오른손, 2,5,8,0은 더 가까운 쪽의 손 사용
// 만약에 더 같다면 hand 정보로 오른손잡이는 오른손, 왼손잡이는 왼손 사용
// num 배열 1이상 1000이하, num 원소는 0~9, hand "right" or "left"
// 결과 값을 왼손이면 L 오른손이면R를 이어붙인대로 리턴해달라

//전에 눌렀던 손의 위치를 고려해야하고, 같다면 hand 정보까지 고려하자 전에 위치의 손을 관리하려면 배열로 관리하면 쉽다
//내 왼손 오른손 위치도 알 수 있고 내가누를 숫자와 각 손가락의 거리를 계산도 쉬워짐



public class SolutionClass {
    Position left; // 왼손과 오른손 위치를 계속 관리해야해서
    Position right; // 왼손과 오른손 위치를 계속 관리해야해서
    Position numPos; // 숫자의 위치를 담기 위해
    public String solution(int[] numbers, String hand) {
        String answer = "";

        // 1. 왼손 오른손 위치를 초기화한다.
        left = new Position(3, 0); // *
        right = new Position(3, 2); // #

        // 2.숫자를 누를 손가락을 정한다.
        for (int num : numbers) { // 넘버스 배열에서 넘에 담아주고 우리가 숫자를 누를 손가락을 정해야하고 나온 걸 정답에 담기
            numPos = new Position((num - 1) / 3, (num - 1) % 3);
            //이거 생각도 못했는데 하나 하나 컬럼마다 숫자를 정해줘도 되지만 이런식으로 하면 5의 경우 1,1이 나오게 된다
            if (num == 0)
                numPos = new Position(3, 1);
            // 0 숫자가 들어오면 우리가 직접지정해주기( *,#은 안들어옴 시작위치일뿐)
            String finger = numPos.getFinger(hand);
            // 이제 어떤 손으로 누를 지 정하기 현재 숫자가 있는데, 그 숫자를 어느 손으로 누를꺼냐 ?
            // 0번컬럼은 왼,2번은 오, 1번은 가까운 곳

            // 3.정해진 손가락을 answer에 담고 손가락 위치를 이동
            answer += finger;
            if (finger.equals("L"))  // 전에 왼손으로 눌렀다면
                left = numPos; // 현재를 왼손의 위치로 바꿔주는 거
            else
                right = numPos; // 오른손으로 눌렀다면 현재 위치에 오른손의 위치를 바꿔주기

        }



        return answer;

    }
    class Position{ //키패드의 위치
        int row;
        int column;

        Position(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public String getFinger(String hand) {
            String finger = hand.equals("right") ? "R" : "L"; // 주손이 오른손이면 핑거에 R 아니면 L
            // 이 이유가 밑에 같을 경우 초기 값으로 같은 거리라면 finger는 주손의 경우가 됨 진작에 예외를 처리해놨음
            if (this.column == 0) // 0컬럼이면 다 왼손 // 현재 넘포스가 5라면  this.colunm은  1이 되는거
                finger = "L";
            else if (this.column == 2) // 2컬럼이면 다 오른손
                finger = "R";
            else {
                int leftDist = left.getDistance(this);
                int rightDIst = right.getDistance(this); //라이트에 저장된 Position객체와 this는 현재 누를 곳의 객체

                if(leftDist < rightDIst)
                    finger = "L";
                else if (rightDIst < leftDist)
                    finger = "R";

            }


            return finger;
        }

        public int getDistance(Position p) { //p 값이 누를 곳이고, this는 현재 손 위치
            return Math.abs(this.row - p.row) + Math.abs(this.column - p.column);

        }
    }

    public static void main(String[] args) {
        SolutionClass sol = new SolutionClass();
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(sol.solution(numbers, hand));
    }
}
