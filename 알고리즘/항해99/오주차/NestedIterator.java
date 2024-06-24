package 알고리즘.항해99.오주차;

import java.util.*;

public class NestedIterator implements Iterator<Integer>{


    /**
     * // This is the interface that allows for creating nested lists.
     * // You should not implement it, or speculate about its implementation
     * public interface NestedInteger {
     *
     *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
     *     public boolean isInteger();
     *
     *     // @return the single integer that this NestedInteger holds, if it holds a single integer
     *     // Return null if this NestedInteger holds a nested list
     *     public Integer getInteger();
     *
     *     // @return the nested list that this NestedInteger holds, if it holds a nested list
     *     // Return empty list if this NestedInteger holds a single integer
     *     public List<NestedInteger> getList();
     * }
     *
     * isInteger():  NestedInteger가 단일 정수를 포함하고 있는지 여부를 확인합니다.
     * getInteger():  NestedInteger가 단일 정수를 포함하고 있을 때 그 정수를 반환합니다.
     * 중첩된 리스트를 포함하고 있을 경우 null을 반환합니다.
     * getList(): NestedInteger가 중첩된 리스트를 포함하고 있을 때 그 리스트를 반환합니다.
     * 단일 정수를 포함하고 있을 경우 빈 리스트를 반환합니다.
     */


    // 감싸있는 거 다 빼고 정수만 반환하라 3가지 메서드
    // 1. list형태의 nestedList가 들어오면 초기화
    // 2. next의 경우 들어오면, 다음 정수 반환
    // 3. hasNext 다음 수가 있음 true 아님 false

    //[[1,1],2,[1,1]] = [1,1,2,1,1]

    //스택으로 확인 ?

    // 판단 방식은 while문에서 hasNext가 true면 next를 호출

    private Stack<NestedInteger> stack;

    public static void main(String[] args) {
        List<NestedInteger> list =Arrays.asList(
                new NestedIntegerImpl(Arrays.asList(
                        new NestedIntegerImpl(1),
                        new NestedIntegerImpl(1)
                )), new NestedIntegerImpl(2),
                        new NestedIntegerImpl(Arrays.asList(
                                new NestedIntegerImpl(1),
                                new NestedIntegerImpl(1))

        ));

        NestedIterator it = new NestedIterator(list);
        List<Integer> result = new ArrayList<>();
        while (it.hasNext()) {
            result.add(it.next());
        }
        System.out.println(result);



    }


        public NestedIterator(List<NestedInteger> nestedList) {

            stack = new Stack<>();

            for (int i = nestedList.size() - 1; i >= 0; i--) {
                stack.push(nestedList.get(i));
            }



        }

        @Override
        public Integer next() {

            return stack.pop().getInteger();


        }

        @Override
        public boolean hasNext() {

            while (!stack.isEmpty()) {
                NestedInteger now = stack.peek();

                if(now.isInteger()) {
                    return true;
                }
                stack.pop();
                List<NestedInteger> nestedList = now.getList();
                for (int i = nestedList.size() - 1; i >= 0; i--) {
                    stack.push(nestedList.get(i));
                }

            }

            return false;

        }
    }



/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */

