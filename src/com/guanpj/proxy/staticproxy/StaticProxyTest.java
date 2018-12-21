package com.guanpj.proxy.staticproxy;

import com.guanpj.proxy.Operate;

public class StaticProxyTest {
    public static void main(String[] args) {
        Operate operate = new OperationProxy();//使用OperationProxy代替Operator
        operate.doSomething();  //代理者代替真实者做事情
    }
}
