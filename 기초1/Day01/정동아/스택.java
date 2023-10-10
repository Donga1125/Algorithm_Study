package 기초1.Day01.정동아;

import java.util.Scanner;

public class 스택 {
    //정수를 저장하는 스택 구현
    //입력으로 주어지는 명령 처리
    public static int[] stack;
    public static int size=0;
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         StringBuilder sb = new StringBuilder(); //한줄에 하나씩 출력하기 위해

         //첫줄에 입력받는 명령 수로 사이즈 조절
         int num = in.nextInt();
         stack = new int[num];

         for (int i = 0; i < num; i++){
             String str = in.next();

             switch (str){
                 case "push":
                     push(in.nextInt());
                     break;

                 case "pop":
                     sb.append(pop()).append('\n');
                     break;

                 case "size":
                     sb.append(size()).append('\n');
                     break;

                 case "empty":
                     sb.append(empty()).append('\n');
                     break;

                 case "top":
                     sb.append(top()).append('\n');
                     break;
             }

         }

         System.out.println(sb);
    }

    public static void push (int number){
         stack[size] = number;
         size++;
    }

    public static int pop (){
        if (size == 0){
            return -1;
        }else {
            int result = stack[size -1];
            stack[size-1] = 0; //바로 리턴해주면 배열 사이즈 조정이 안됨
            size--;
            return result;
        }
    }

    public static int size(){
         return size;
    }

    public static int empty(){
        if (size == 0){
            return 1;
        }else {
            return 0;
        }
    }

    public static int top(){
        if (size ==0){
            return -1;
        }else {
            return stack[size-1];
        }
    }
}
