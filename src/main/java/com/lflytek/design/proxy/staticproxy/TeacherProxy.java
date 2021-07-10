package com.lflytek.design.proxy.staticproxy;

import lombok.AllArgsConstructor;

/**
 * @createDate:2021/6/24
 */
@AllArgsConstructor
public class TeacherProxy implements ITeacher {

    private ITeacher teacher;

    @Override
    public void teach() {
        System.out.println("------------------   授课准备");
        teacher.teach();
        System.out.println("-------------------   下课");
    }
}
