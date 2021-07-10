package com.lflytek.design.proxy.jdk;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @createDate:2021/6/24
 */
@AllArgsConstructor
@Data
public class TeacherFactoryProxy {
    private ITeacher target;
    private String name;

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                new Class[]{ITeacher.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理老师" + name + "来了");
                        Object invoke = method.invoke(target, args);
                        System.out.println("代理老师" + name + "感觉很好，走了");
                        return invoke;
                    }
                }
        );
    }

}
