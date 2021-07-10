package com.lflytek.design.proxy.staticproxy;

import lombok.AllArgsConstructor;

/**
 * @createDate:2021/6/24
 */
@AllArgsConstructor
public class TeacherDao implements ITeacher {
    private String name;

    @Override
    public void teach() {
        System.out.println(name + "授课。。。");
    }
}
