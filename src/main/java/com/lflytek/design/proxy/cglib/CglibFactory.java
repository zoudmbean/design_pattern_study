package com.lflytek.design.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @createDate:2021/6/26
 */
public class CglibFactory implements MethodInterceptor {

    // 维护一个目标对象
    private Object targer;
    public CglibFactory(Object targer){
        this.targer = targer;
    }

    // 定义一个方法用于外部获取代理对象
    public Object getInstanceProxy(){
        // 1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(targer.getClass());
        // 3. 设置回调
        enhancer.setCallback(this);
        // 4. 构建代理对象并返回
        Object o = enhancer.create();
        return o;
    }

    // 重写拦截器方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("进入CGLIB拦截器：");
        Object invoke = methodProxy.invoke(targer, args);
        System.out.println("拦截器执行结束");
        return invoke;
    }
}
