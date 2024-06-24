package 알고리즘.프로그래머스.항해99.오주차;

import java.util.List;

public class NestedIntegerImpl implements NestedInteger {
    private Integer value;
    private List<NestedInteger> list;


    public NestedIntegerImpl(Integer value) {
        this.value = value;
        this.list = null;
    }

    public NestedIntegerImpl(List<NestedInteger> list) {
        this.value = null;
        this.list = list;
    }




    @Override
    public boolean isInteger() {
        return value != null;
    }

    @Override
    public Integer getInteger() {
        return value;
    }

    @Override
    public List<NestedInteger> getList() {
        return list;
    }

}
