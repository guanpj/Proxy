package com.guanpj.proxy.staticproxy;

import com.guanpj.proxy.Operate;
import com.guanpj.proxy.Operator;

public class OperationProxy implements Operate {
    private Operator operator = null;

    @Override
    public void doSomething() {
        beforeDoSomething();
        if(operator == null){
            operator =  new Operator();
        }
        operator.doSomething();
        afterDoSomething();
    }

    private void beforeDoSomething() {
        System.out.println("before doing something");
    }

    private void afterDoSomething() {
        System.out.println("after doing something");
    }
}
