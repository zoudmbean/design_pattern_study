package com.lflytek.design.proxy.cglib;

/**
 * @createDate:2021/6/26
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        CglibFactory cf = new CglibFactory(teacherDao);
        TeacherDao proxy = (TeacherDao)cf.getInstanceProxy();
        proxy.teach();
    }
}
