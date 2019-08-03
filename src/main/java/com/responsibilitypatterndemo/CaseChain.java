package com.responsibilitypatterndemo;

import com.responsibilitypatterndemo.base.BaseCase;

import java.util.ArrayList;
import java.util.List;

public class CaseChain implements BaseCase {


    // 所有 case 列表
    private List<BaseCase> mCaseList;
    // 索引，用于遍历所有 case 列表
    private int index = 0;

    public CaseChain() {
        mCaseList = new ArrayList<>();
    }

    // 添加 case
    public CaseChain addBaseCase(BaseCase baseCase) {
        mCaseList.add(baseCase);
        return this;
    }

    @Override
    public void doSomething(String input, BaseCase chain) {
        System.out.println(this + ".doSomething");
        // 所有遍历完了，直接返回
        if (index == mCaseList.size()) {
            System.out.println("执行完毕，无法处理==>" + input);
            return;
        }

        // 获取当前 case
        BaseCase currentCase = getCurrentCase();
        // 修改索引值，以便下次回调获取下个节点，达到遍历效果
        index++;
        // 调用当前 case 处理方法
        currentCase.doSomething(input, this);
    }

    public BaseCase getCurrentCase() {
        if (mCaseList == null) {
            return null;
        }
        return mCaseList.get(index);
    }


}