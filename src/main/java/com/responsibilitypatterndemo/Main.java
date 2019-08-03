package com.responsibilitypatterndemo;

import com.responsibilitypatterndemo.cases.DefaultCase;
import com.responsibilitypatterndemo.cases.OneCase;
import com.responsibilitypatterndemo.cases.TwoCase;

/**
 * 版权:上海屋聚 版权所有
 * author: yandeqing
 * version: 3.0.0
 * date:2019/7/30 11:18
 * 备注:优化版的责任链模式示例
 * https://github.com/Blankj/AndroidOfferKiller/blob/master/design-patterns/%E8%B4%A3%E4%BB%BB%E9%93%BE%E6%A8%A1%E5%BC%8F.md
 * 剖析本质:
 * 责任链有先后顺序,前面的可以决定后面的任务是否继续执行直到执行到链的末端
 *
 *
 */
class Main {

    public static void main(String[] args) {
        String input = "0";
        CaseChain caseChain = new CaseChain();
        caseChain.addBaseCase(new OneCase())
                .addBaseCase(new TwoCase())
                .addBaseCase(new DefaultCase());
        caseChain.doSomething(input, caseChain);
    }
}
