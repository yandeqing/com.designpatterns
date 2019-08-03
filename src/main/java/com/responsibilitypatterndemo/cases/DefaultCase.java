package com.responsibilitypatterndemo.cases;

import com.responsibilitypatterndemo.base.BaseCase;

public class DefaultCase implements BaseCase {

    @Override
    public void doSomething(String input, BaseCase baseCase) {
        System.out.println(this + ".doSomething");
        if ("0".equals(input)) {
            // TODO do something
            System.out.println(getClass().getName());
            return;
        }
        // 当前没法处理，回调回去，让下一个去处理
        baseCase.doSomething(input, baseCase);
    }


}