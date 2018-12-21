package com.guanpj.proxy.cglib;

import com.guanpj.proxy.Operator;
import com.guanpj.proxy.ProxyUtils;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Operator operator = new Operator();
        MethodInterceptorImpl methodInterceptorImpl = new MethodInterceptorImpl();

        //初始化加强器对象
        Enhancer enhancer = new Enhancer();
        //设置代理类
        enhancer.setSuperclass(operator.getClass());
        //设置代理回调
        enhancer.setCallback(methodInterceptorImpl);

        //创建代理对象
        Operator operationProxy = (Operator) enhancer.create();
        //调用操作方法
        operationProxy.doSomething();
    }
}
