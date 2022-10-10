package com.taobao.integral;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestMethodArgs {
    public static void main(String[] args) {
        ProxyInter proxyInter = (ProxyInter) Proxy.newProxyInstance(ProxyInter.class.getClassLoader(), new Class[]{ProxyInter.class}, new MyInvocationHandler());
        proxyInter.test();

    }
}

interface ProxyInter {
    void test();
}

class MyInvocationHandler implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("测试");
        return "测试";
    }
}
