package com.guanpj.proxy.dynamicproxy;

import com.guanpj.proxy.Operate;
import com.guanpj.proxy.Operator;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        //实例化操作者
        Operate operate = new Operator();
        //将操作者对象进行注入
        InvocationHandlerImpl handler = new InvocationHandlerImpl(operate);
        //生成代理对象
        Operate operationProxy = (Operate) Proxy.newProxyInstance(operate.getClass().getClassLoader(),
                operate.getClass().getInterfaces(), handler);
        //调用操作方法
        operationProxy.doSomething();
    }
}
