package com.guanpj.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MethodInterceptorImpl implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before calling method:" + method.getName());
        proxy.invokeSuper(obj, args);
        System.out.println("after calling method:" + method.getName());
        return null;
    }
}
