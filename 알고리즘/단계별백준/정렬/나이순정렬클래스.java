package 알고리즘.단계별백준.정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 나이순정렬클래스 {
    // 객체로 만들어서 비교 object의 arraysSort는 timsort ( 배열의 수에 따라 달라지지만 머지소트쓸듯 ?)
    // stable한 정렬이라서 입력 순서가 보장 받아 정렬한다!

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[][] arr = new int[n][2];

        Person[] p = new Person[n];

        for (int i = 0; i < n; i++) {
            p[i] = new Person(sc.nextInt(), sc.next()); // 각각 새로운 person에 저장
        }


//        Arrays.sort(p, new Comparator<Person>() {
//            // 나이순서로 정렬 sort가 stable한 정렬이라 입력순서 유지 가능
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.age - o2.age;
//            }
//
//        });

        Arrays.sort(p, (e1, e2) ->
                e1.age - e2.age); // 람다식으로 구현

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(p[i]);
        }

        System.out.println(sb); //내가 오버라이딩하(재정의)한 toString 호출함
    }

    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }


}
