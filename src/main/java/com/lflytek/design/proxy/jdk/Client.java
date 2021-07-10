package com.lflytek.design.proxy.jdk;

/**
 * @createDate:2021/6/24
 */
public class Client {
    public static void main(String[] args) {
        ITeacher teacher = new TeacherDao("张老师");
        TeacherFactoryProxy factoryProxy = new TeacherFactoryProxy(teacher,"李老师");
        ITeacher proxyInstance = (ITeacher)factoryProxy.getProxyInstance();
        proxyInstance.teach();
    }
}
