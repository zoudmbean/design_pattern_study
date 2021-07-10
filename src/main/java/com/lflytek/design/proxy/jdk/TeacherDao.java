package com.lflytek.design.proxy.jdk;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @createDate:2021/6/24
 */
@AllArgsConstructor
@Data
public class TeacherDao implements ITeacher{
    private String name;
    @Override
    public void teach() {
        System.out.println(name + "上课");
    }

    @Override
    public void down() {
        System.out.println("下课了");
    }
}
