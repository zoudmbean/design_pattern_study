package com.lflytek.design.proxy.staticproxy;

/**
 * @createDate:2021/6/24
 */
public class Client {
    public static void main(String[] args) {
        ITeacher teacher = new TeacherDao("张老师");
        TeacherProxy teacherProxy = new TeacherProxy(teacher);
        teacherProxy.teach();
    }
}
